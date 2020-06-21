import Vue from 'vue'
import VueRouter from 'vue-router'
import Login from '../views/Login'
import Index from '../views/Index'
Vue.use(VueRouter)
const  Project=()=>import(/* webpackChunkName: "about" */ '../views/codeGeneration/Project')
  const routes = [
  {
    path: '/',
    redirect:"/Login"
  },
    {
      path: '/login',
      name: 'login',
      component: Login
    },
    {
      path: '/index',
      component: Index,
      children:[
        {
          path: '/index/codeGeneration',
          name:"codeGeneration",
          component: Project
        }
      ]
    }
  //   ,
  // {
  //   path: '/about',
  //   name: 'About',
  //   // route level code-splitting
  //   // this generates a separate chunk (about.[hash].js) for this route
  //   // which is lazy-loaded when the route is visited.
  //   component: () => import(/* webpackChunkName: "about" */ '../views/About.vue')
  // }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})
//判断用户是否登录
// router.beforeEach((to, from, next)=>{
//   console.log(to)
//   console.log(from)
//
//   if(to.path=="/login"){
//     return next();
//   }
//   //判断用户是否登录
//   next();
//
//
// })


export default router
