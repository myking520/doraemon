<template>
  <div class="dashboard-editor-container">
    <el-container>
      <el-header align="right">
        <el-dropdown>
          <span>
        <i class="el-icon-arrow-down el-icon--right" ></i>
          王小虎
          </span>
        <el-dropdown-menu slot="dropdown">
          <el-dropdown-item>查看</el-dropdown-item>
          <el-dropdown-item>新增</el-dropdown-item>
          <el-dropdown-item>退出</el-dropdown-item>
        </el-dropdown-menu>
      </el-dropdown>

      </el-header>
      <el-container>
        <el-aside >
          <el-radio-group v-model="isCollapse" style="margin-bottom: 20px;">
            <el-radio-button :label="false">展开</el-radio-button>
            <el-radio-button :label="true">收起</el-radio-button>
          </el-radio-group>
          <el-menu  :default-active="$route.path" class="el-menu-vertical-demo" @open="handleOpen" @close="handleClose" :collapse="isCollapse" router>
            <NavMenu :navMenus="menuData"></NavMenu>
          </el-menu>
        </el-aside>
        <el-main>
          <el-breadcrumb separator-class="el-icon-arrow-right">
            <el-breadcrumb-item :to="{ path: '/' }">首页</el-breadcrumb-item>
            <el-breadcrumb-item>活动管理</el-breadcrumb-item>
            <el-breadcrumb-item>活动列表</el-breadcrumb-item>
            <el-breadcrumb-item>活动详情</el-breadcrumb-item>
          </el-breadcrumb>

          <div class="app-wrap" >
            <!-- 此处放置el-tabs代码 -->
            <div >
              <el-tabs
                      v-model="activeTabIndex"
                      type="border-card"
                      closable
                      v-if="openTabs.length"
                      @tab-click='tabClick'
                      @tab-remove='tabRemove'
              >

                <el-tab-pane
                        :key="item.name"
                        v-for="(item) in openTabs"
                        :label="item.name"
                        :name="item.route"
                        style="display: none;"
                >
                </el-tab-pane>
              </el-tabs>
            </div>
          </div>
          <router-view></router-view>

        </el-main>
      </el-container>
    </el-container>


  </div>
</template>

<script>

import NavMenu from "../components/NavMenu"
const lineChartData = {
  newVisitis: {
    expectedData: [100, 120, 161, 134, 105, 160, 165],
    actualData: [120, 82, 91, 154, 162, 140, 145]
  },
  messages: {
    expectedData: [200, 192, 120, 144, 160, 130, 140],
    actualData: [180, 160, 151, 106, 145, 150, 130]
  },
  purchases: {
    expectedData: [80, 100, 121, 104, 105, 90, 100],
    actualData: [120, 90, 100, 138, 142, 130, 130]
  },
  shoppings: {
    expectedData: [130, 140, 141, 142, 145, 150, 160],
    actualData: [120, 82, 91, 154, 162, 140, 130]
  }
}


export default {
  name: 'Index',
  components: {
    NavMenu

  },
  data() {
    return {
      isCollapse: false,
      tableData:[],
      lineChartData: lineChartData.newVisitis,
      activeIndex: 'aa',
      menuData: [
        {
          id: 0,
          path: "home",
          icon: "el-icon-message",
          name: "代码生成",
          children:[
            {
              id: 0,
              path: "/index/codeGeneration",
              icon: "el-icon-message",
              name: "项目",
            }

          ]
        }

      ],


    }
  },
  methods: {
    handleSetLineChartData(type) {
      this.lineChartData = lineChartData[type]
    },
    handleOpen(key, keyPath) {
      console.log(key, keyPath);
    },
    handleClose(key, keyPath) {
      console.log(key, keyPath);
    },
    gohome(){
      //this.$router.push("/Home");
    },
    tabClick(tab){
      console.log("tab",tab);
      console.log('active',this.activeTabIndex);
      this.$router.push({path: this.activeTabIndex});
    },
    //移除tab标签
    tabRemove(targetName){
      console.log("tabRemove",targetName);
      //首页不删
      if(targetName == '/'||targetName == '/index'){
        return
      }
      this.$store.commit('remove_tabs', targetName);
      if (this.activeIndex === targetName) {
        // 设置当前激活的路由
        if (this.openTabs && this.openTabs.length >= 1) {
          console.log('=============',this.openTabs[this.openTabs.length-1].route)
          this.$store.commit('active_tab', this.openTabs[this.openTabs.length-1].route);
          this.$router.push({path: this.activeIndex});
        } else {
          this.$router.push({path: '/'});
        }
      }
    }
  },
  computed:{
    openTabs:function(){
      return this.$store.state.openTabs.openTabs;
    },
    activeTabIndex:{
      get(){
        return this.$store.state.activeTabIndex;
      },
      set(value){
        return this.$store.commit("active_tab",value)
      }
    }
  }
  ,
  mounted () {

    // if (this.$route.path !== '/' && this.$route.path !== '/main') {
    //   // this.$store.commit('add_tabs', {route: '/index' , name: 'index'});
    //   this.$store.commit('add_tabs', {route: this.$route.path , name: this.$route.name });
    //   this.$store.commit('active_tab', this.$route.path);
    //   this.$router.push('/index/codeGeneration');
    // } else {
    //   this.$store.commit('add_tabs', {route: '/main', name: 'main'});
    //   this.$store.commit('active_tab', '/main');
    //   this.$router.push('/');
    // }
  },
}
</script>


<style scoped>
  .el-header{
    background-color: aqua;
  }
  .el-tabs--border-card.el-tabs__content{
    display: none;
  }
</style>
