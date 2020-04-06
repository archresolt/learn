// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'//App为变量名
import router from './router'
import ElemnetUi from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
//引入axios用于访问后台，axios和vue.resource还有ajax一样，都是用于访问后台服务的
import axios from 'axios'
window.axios=axios;
window.Vue=Vue;
Vue.config.productionTip = false

Vue.use(ElemnetUi)
/* eslint-disable */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
