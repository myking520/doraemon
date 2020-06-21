import Vue from 'vue'
import Vuex from 'vuex'
import  token from "../store/modules/token"
import  user from "../store/modules/user"
import openTabs from "./modules/openTabs";
Vue.use(Vuex)

export default new Vuex.Store({
  //保存状态
  state: {
  },
  mutations: {
  },
  actions: {
  },
  modules: {
    user,
    token,
    openTabs
  },
  getters:{

  }
})
