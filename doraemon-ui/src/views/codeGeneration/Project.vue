<template>

    <el-card>
        <div>
            <el-row>
                <el-col :span="5">
                    <div style="margin-top: 15px;">
                        <el-input placeholder="请输入内容" class="input-with-select" v-model="queryInfo.query" clearable
                                  @clear="listProject">
                            <el-button slot="append" icon="el-icon-search" @click="handlerSearch"></el-button>
                        </el-input>
                    </div>
                </el-col>
                <el-col :span="19">
                    <div style="float: right">
                        <el-button @click="addProject">添加</el-button>
                        <el-button>删除</el-button>
                    </div>

                </el-col>
            </el-row>

        </div>
        <el-table
                :data="tableData"
                v-loading="loading"
                style="width: 100%"
                row-key="id"
                :default-sort="{prop: 'date', order: 'descending'}"
        >
            <el-table-column
                    prop="date"
                    label="日期"
                    sortable
                    width="180">
            </el-table-column>
            <el-table-column
                    prop="name"
                    label="姓名"
                    sortable
                    width="180">
            </el-table-column>
            <el-table-column

                    label="状态"
                    sortable
                    width="180">
                <template slot-scope="scope">
                    <el-switch
                            v-model="scope.row.status"
                            active-color="#13ce66"
                            inactive-color="#ff4949" @change="changeState(scope.row)">
                    </el-switch>

                </template>
            </el-table-column>
            <el-table-column
                    prop="name"
                    label="操作"

                    width="180">
                <template slot-scope="scope">
                    <el-button
                            size="mini"
                            @click="handleEdit(scope.$index, scope.row)">编辑
                    </el-button>
                    <el-button
                            size="mini"
                            type="danger"
                            @click="handleDelete(scope.$index, scope.row)">删除
                    </el-button>
                </template>
            </el-table-column>
        </el-table>
        <div style="float: left">
            <el-pagination
                    @size-change="handleSizeChange"
                    @current-change="handleCurrentChange"
                    :current-page="queryInfo.currentPage"
                    :page-sizes="[100, 200, 300, 400]"
                    :page-size="queryInfo.pageSize"
                    layout="total, sizes, prev, pager, next, jumper"
                    :total="queryInfo.totalNum">

            </el-pagination>
        </div>
        <div>
        <el-dialog
                title="添加项目"
                :visible.sync="addProjectDialog"
                width="30%"
                >
            <el-form :model="projectInfo" status-icon :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
                <el-form-item label="项目名称" prop="name">
                    <el-input type="name" v-model="projectInfo.name" autocomplete="off"></el-input>
                </el-form-item>
                <el-form-item>
                    <el-button type="primary" @click="submitForm('ruleForm')">提交</el-button>
                    <el-button @click="resetForm('ruleForm')">重置</el-button>
                </el-form-item>
            </el-form>
            <span slot="footer" class="dialog-footer">
    <el-button @click="addProjectDialog = false">取 消</el-button>
    <el-button type="primary" @click="addProjectDialog = false">确 定</el-button>
  </span>
        </el-dialog>
        </div>
    </el-card>

</template>

<script>
    export default {
        name: "Project",
        data() {
            return {
                loading: true,
                addProjectDialog:false,
                tableData: [],
                projectInfo:{},
                queryInfo: {
                    query: "",
                    currentPage: 1,
                    totalNum: 39900,
                    pageSize: 100
                },
                rules:{
                    name:[
                        { required: true, message: '请输入名称', trigger: 'blur' }
                    ]
                }
            }
        },
        created() {
            this.listProject();
        }

        ,
        methods: {
            listProject: function () {
                console.log("查询被触发")
                console.log(this.queryInfo)
                this.tableData = [
                    {
                        id: "1",
                        name: "23",
                        date: "2020-20-20 12:12:12",
                        status: true,
                    },
                    {
                        id: "2",
                        name: "23",
                        date: "2020-20-20 12:12:12",
                        status: false,
                    }
                ]
                setTimeout(() => {
                    this.loading = false
                }, 2000)
            },
            handleEdit: function () {

            },
            handleDelete: function () {

            },
            handleSizeChange: function () {

            },
            handleCurrentChange: function () {

            },
            handlerSearch: function () {

            },
            changeState: function (row) {
                // if(false){ 远程请求如果改变失败还原状态
                //  row.status=!row.status
                // }
                console.log(row)
            },
            addProject:function(){
                this.addProjectDialog=true
            }
        }
    }
</script>

<style scoped>

</style>
