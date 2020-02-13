import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import hello from '@/components/hello'
//这里分别导入五个对应页面
import exp1 from '@/components/index/exp1'
//import navi from '@/components/navi'
import exp2 from '@/components/community/exp2'
import exp3 from '@/components/trip/exp3'
import exp4 from '@/components/found/exp4'
import exp5 from '@/components/Aboutus/exp5'
import exp6 from '@/components/gallery/exp6'
Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/gallery/exp6',
      name: 'gallery',
      component: exp6,
    },
    //这里分别注册五个导航的路由
   
    {
      path: '/index/exp1',
      name: 'index',
      component: exp1,
    },
    /* {
      path:'/navi',
      name:'navi1',
  component:navi,
    },*/
    {
      path: '/community/exp2',
      name: 'community',
      component: exp2,
    },
    {
      path: '/trip/exp3',
      name: 'trip',
      component: exp3,
    },
    {
      path: '/found/exp4',
      name: 'found',
      component: exp4,
    },
    {
      path: '/Aboutus/exp5',
      name: 'Aboutus',
      component: exp5,
    },


    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld
    },
    {
      path: '/hello',
      name: 'hello1',
      component: hello
    }
  ]
})
