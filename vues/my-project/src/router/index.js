import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import jieShaoYe from '@/components/index/jieShaoYe'
// import hello from '@/components/hello'
//这里分别导入五个对应页面
import exp1 from '@/components/index/exp1'
//import navi from '@/components/navi'
import exp2 from '@/components/community/exp2'
import exp0 from '@/components/community/exp0'
import exp3 from '@/components/trip/exp3'
import aaa from '@/components/found/exp4'
import exp5 from '@/components/Aboutus/exp5'
// import exp6 from '@/components/gallery/exp6'
import communityHomePage from '@/components/community/index'
import indexPage from '@/components/index/expindex'
import changepage from "@/components/trip/changPage"
import courseInfo from "@/components/findgreat/courseInfo"
import equipInfo from "@/components/findgreat/equipInfo"
Vue.use(Router)

export default new Router({
  routes: [
    {
      path:'/jieShaoYe',
      name:'jieShaoYe',
      component:jieShaoYe,
    },
    {
      path:'/equipInfo',
      name:'equipInfo',
      component:equipInfo,
    },
    {
      path:'/courseInfo',
      name:'courseInfo',
      component:courseInfo,
    },
    {
path:'/changePage',
name:'changePage',
component:changepage,
    },
    {
path:'/index/expindex',
name:'expindex',
component:indexPage,
    },
    // {
    //   path: '/gallery/exp6',
    //   name: 'gallery',
    //   component: exp6,
    // },
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
      path: '/community',
      name: 'community',
      component: communityHomePage,
    },
    {
      path: '/community/exp2',
      name: 'e2',
      component: exp2,
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
      path: '/found/exp4',
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
    // {
    //   path: '/hello',
    //   name: 'hello1',
    //   component: hello
    // }
  ]
})
