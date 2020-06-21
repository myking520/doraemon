const token={
    state:{
        access_token:""
    }
    ,
    mutations:{
      storeToken(token){
          this.access_token=token;
      }
    },
    actions:{

    }
}
export default  token
