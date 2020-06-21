import request from "../network/RequestBaseServer"
import qs from 'qs'
export  function login(data){
    return request({url:'/login',headers: { 'content-type': 'application/x-www-form-urlencoded' },data:qs.stringify(data),method:'post'})
}
