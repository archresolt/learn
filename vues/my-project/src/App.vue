<template>
<div id="app">
    <!--这里加入一个导航栏
    -->
    <navi ref="myNavi"></navi>
    <router-view />
    <loginAndRegist v-show="showLogin"></loginAndRegist>
     <!-- <jieShaoYe style="position:absolute;top:90px;left:132px;margin:0 auto;" v-show="showJieShao"></jieShaoYe> -->
    <!-- <div class="mask"> -->
    <!--这里加入注册界面-->
    <!-- </div> -->
</div>
</template>

<script>
import loginAndRegist from "./components/loginAndRegist";
import jieShaoYe from "./components/index/jieShaoYe";
//这里导入一个导航栏组件
import didi from "@/components/navi";
export default {
//      components: {

//     jieShaoYe:jieShaoYe,
//   },
    data() {
        return {
            showLogin: false,
            showJieShao:false,
        }
    },
    //这里注册导航栏组件
    mounted() {
        console.log('App.vue', this);
        console.log('navi.vue', this.$refs.myNavi);
        //根節點在觀察到login發生時，執行xxx函數
        this.$root.$on('login', (visiable) => {
            this.showLogin = visiable;
        });
    this.$root.$on('intrduce', (visiable) => {
            this.showJieShao = visiable;
        });
    },
    components: {
        jieShaoYe:jieShaoYe,
        navi: didi,
        loginAndRegist: loginAndRegist,
    },
};
</script>

<style>
#app {
    font-family: "Avenir", Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    text-align: center;
    color: #2c3e50;
    /* font-size: ; */
}

.mask {
    position: fixed;
    width: 100%;
    height: 100%;
    margin: 0 0;
    background: rgba(0, 0, 0, 0.5);
    top: 0;
    left: 0;
}
</style>
