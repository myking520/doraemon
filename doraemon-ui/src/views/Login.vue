<template>

  <div>
    <el-form ref="loginForm" :model="form" :rules="rules" label-width="80px" class="login-box">
      <h3 class="login-title">欢迎登录</h3>
      <el-form-item label="账号" prop="username">
        <el-input type="text"  prefix-icon="el-icon-user-solid" placeholder="请输入账号" v-model="form.username"/>
      </el-form-item>
      <el-form-item label="密码" prop="username">
        <el-input type="password"  placeholder="请输入密码" v-model="form.password">
        <i slot="prefix" class="el-input__icon el-icon-lock"></i>
        </el-input>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" v-on:click="onSubmit('loginForm')">登录</el-button>
        <el-button @click="resetForm('loginForm')">重置</el-button>
      </el-form-item>
    </el-form>
    <el-dialog
            title="温馨提示"
            :visible.sync="dialogVisible"
            width="30%"
            >
      <span>请输入账号和密码</span>
      <span slot="footer" class="dialog-footer">
        <el-button type="primary" @click="dialogVisible = false">确 定</el-button>
      </span>
    </el-dialog>
  </div>
</template>
<script>
  import { login } from "@/api/Login";

  export default {
    name: "Login",
    data() {
      return {
        form: {
          username: 'admin',
          password: 'jusda2019',
          clientId:"CP_PLATFORM"
        },
        // 表单验证，需要在 el-form-item 元素中增加 prop 属性
        rules: {
          username: [
            {required: true, message: '账号不可为空', trigger: 'blur'}
          ],
          password: [
            {required: true, message: '密码不可为空', trigger: 'blur'}
          ]
        },

        // 对话框显示和隐藏
        dialogVisible: false
      }
    },
    methods: {
      onSubmit(formName) {
        // 为表单绑定验证功能
        this.$refs[formName].validate((valid) => {
          if (valid) {
            login(this.form).then(res=>{
              if(res){
                // 使用 vue-router 路由到指定页面，该方式称之为编程式导航
                this.$router.push("/index");
              }else{
                this.$message({
                  showClose: true,
                  message: '恭喜你，这是一条成功消息',
                  type: 'success'
                });
              }
              console.log(res)
            })

          } else {
            //显示对话框
            this.dialogVisible = true;
            return false;
          }
        });
      },
      resetForm(formName){
        //重置表单
        this.$refs[formName].resetFields();
      }
    }
  }
</script>
<style lang="less" scoped>

  .login-box {
    border: 1px solid #DCDFE6;
    width: 350px;
    margin: 180px auto;
    padding: 35px 35px 15px 35px;
    border-radius: 5px;
    -webkit-border-radius: 5px;
    -moz-border-radius: 5px;
    box-shadow: 0 0 25px #909399;
  }

  .login-title {
    text-align: center;
    margin: 0 auto 40px auto;
    color: #303133;
  }
</style>
