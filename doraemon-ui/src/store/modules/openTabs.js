const openTabs={
    state:{
        openTabs:[],
        activeTabIndex:"/index"//激活状态
    }
    ,
    mutations:{
        add_tabs:function(state,data){
            state.openTabs.push(data);
        },
        remove_tabs:function(state,route){
            let index = 0;
            for (let option of state.openTabs) {
                if (option.route === route) {
                    break;
                }
                index++;
            }
            state.openTabs.splice(index, 1);
        },
        active_tab:function(state,index){
            state.activeIndex=index;
        }
    },
    actions:{

    }
}
export default  openTabs
