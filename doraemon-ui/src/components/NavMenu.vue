<template>

    <div>
        <template v-for="navMenu in navMenus">
            <!-- 无子菜单 -->
            <el-menu-item v-if="!navMenu.children&&navMenu.name"
                          :key="navMenu.id" :data="navMenu" :index="navMenu.path+''">

                <span slot="title">{{navMenu.name}}</span>
            </el-menu-item>
            <!-- 此菜单下还有子菜单 -->
            <el-submenu v-if="navMenu.children&&navMenu.name"
                        :key="navMenu.id" :data="navMenu" :index="navMenu.path+''">
                <template slot="title">
                    <i class="el-icon-location"></i>
                    <span slot="title">{{navMenu.name}}</span>
                </template>
                <!-- 递归 -->
                <NavMenu :navMenus="navMenu.children"></NavMenu>
            </el-submenu>

        </template>
    </div>



</template>

<script>
    export default {
        name: 'NavMenu',
        props: {
            navMenus: Array
        },
        data() {
            return {dnavMenus:this.navMenus}
        },
        methods: {},
        computed:{
            submenus:function(){
               return this.dnavMenus.filter(nav=>{
                   return !nav.children&&nav.name;
               })
            }
        }
    }
</script>

<style>
</style>
