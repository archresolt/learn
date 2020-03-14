<template>
  <div id="app">
    <!--这里加入一个导航栏
    -->
    <ti1></ti1>
    <router-view />
    <!-- <div class="mask"> -->
      <!--这里加入注册界面-->
    <!-- </div> -->
  </div>
</template>

<script>
//这里导入一个导航栏组件
import didi from "@/components/navi";
export default {
  //这里注册导航栏组件

  components: { ti1: didi },
  name: "navi"
};
</script>

<style>
#app {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
 
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
