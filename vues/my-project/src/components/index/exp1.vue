<template>
  <!-- <div style="font-size: 30px; color:red;">这里是首页</div>-->
  <div>
    <!-- <retrievetripimg>
   
    </retrievetripimg>-->
    <serachinput></serachinput>
    <Retrieveitems1></Retrieveitems1>
    <Wholetrip></Wholetrip>
    <!-- <retrievetripimg></retrievetripimg> 这里是旧的trip组件 -->
    <!-- 千万要注意这里绑定的只是一个属性名称，在trip插件内部用props声明了这个属性名trip1 -->
   <div class="exp1part0">
     <div class="exp1part1">
    <trip :trip1="item" v-for="item in journey" :key ="item"></trip>
   </div>
    </div>

    <!--  -->
    <pagefooter></pagefooter>
  </div>
</template>
<style scoped>
/*1、自己定一个命名格式，严格遵循  
2、把大部分的css移动到一个css文件里去，这样重名就很容易找到了。
3、在组件内部的css，加上scoped属性，<style scoped> */
.exp1part0{
  width:1440px;
  height: 600px;
  margin:0 auto;
}
.exp1part1{
  width:1180px;
  height: 600px;
  margin:0 auto;
}
</style>
<script>
import retrievetripimg from "../myfirstgallery/retrievetripimg";
import Retrieveitems1 from "../myfirstgallery/Retrieveitems1";
import serachinput from "../myfirstgallery/serachinput";
import Wholetrip from "../myfirstgallery/Wholetrip";
import trip from "../myfirstgallery/trip";
import pagefooter from "../pagebottom/pagefooter";

var a= {
  data() {
    return {
      config1: {
        name: "梅鲁利浮岛度假村",
        pho: "/static/img/房子.ed42443.png",
        address: "斐济/一级行政区/二级行政区",
        type: "度假村",
        price: "￥8766起/人"
      },
      journey: [
        {
          name: "梅鲁利浮岛度假村",
          pho: "/static/img/房子.ed42443.png",
          address: "斐济/一级行政区/二级行政区",
          type: "度假村",
          price: "￥8766起/人"
        },
        {
          name: "梅鲁利浮岛度假村",
          pho: "/static/img/房子.ed42443.png",
          address: "斐济/一级行政区/二级行政区",
          type: "度假村",
          price: "￥8766起/人"
        },
        {
          name: "梅鲁利浮岛度假村",
          pho: "/static/img/房子.ed42443.png",
          address: "斐济/一级行政区/二级行政区",
          type: "度假村",
          price: "￥8766起/人"
        },
        {
          name: "梅鲁利浮岛度假村",
          pho: "/static/img/房子.ed42443.png",
          address: "斐济/一级行政区/二级行政区",
          type: "度假村",
          price: "￥8766起/人"
        },
         {
          name: "梅鲁利浮岛度假村",
          pho: "/static/img/房子.ed42443.png",
          address: "斐济/一级行政区/二级行政区",
          type: "度假村",
          price: "￥8766起/人"
        },
         {
          name: "梅鲁利浮岛度假村",
          pho: "/static/img/房子.ed42443.png",
          address: "斐济/一级行政区/二级行政区",
          type: "度假村",
          price: "￥8766起/人"
        },
         {
          name: "梅鲁利浮岛度假村",
          pho: "/static/img/房子.ed42443.png",
          address: "斐济/一级行政区/二级行政区",
          type: "度假村",
          price: "￥8766起/人"
        },
         {
          name: "梅鲁利浮岛度假村",
          pho: "/static/img/房子.ed42443.png",
          address: "斐济/一级行政区/二级行政区",
          type: "度假村",
          price: "￥8766起/人"
        },
      ]
    };
  },

  components: {
    retrievetripimg: retrievetripimg,
    Retrieveitems1: Retrieveitems1,
    serachinput: serachinput,
    Wholetrip: Wholetrip,
    trip: trip,
    pagefooter:pagefooter,
  }
};
export default a;
</script>