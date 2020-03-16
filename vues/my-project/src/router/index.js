import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import hello from '@/components/hello'
//这里分别导入五个对应页面
import exp1 from '@/components/index/exp1'
//import navi from '@/components/navi'
import ddd from '@/components/community/exp2'
import exp0 from '@/components/community/exp0'
import exp3 from '@/components/trip/exp3'
import aaa from '@/components/found/exp4'
import exp5 from '@/components/Aboutus/exp5'
import sg from '@/components/gallery/exp6'
Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/gallery/exp6',
      name: 'gallery',
      component: sg,
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
      component: ddd,
    },
    {
      path: '/community/exp0',
      name: 'community',
      component: exp0,
    },
    {
      path: '/trip/exp3',
      name: 'trip',
      component: exp3,
    },
    {
<<<<<<< HEAD
      path: '/caiyu',
=======
      path: '/a',
>>>>>>> d7e2d672f82cf3ee5ec33978b547611b2a5802ff
      name: 'found',
      component: aaa,
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
