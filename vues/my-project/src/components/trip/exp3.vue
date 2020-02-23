<template>
  <div>
    <headphotos></headphotos>
    <recommend :textinserts="text1"></recommend>
    <imagetexts></imagetexts>
    <photos></photos>
     <recommend :textinserts="text2"></recommend>
    <div class="exp3part0">
      <popdestination :trip1="item" v-for="item in journey" :key="item"></popdestination>
    </div>
<viewmore></viewmore>
    <pagefooter></pagefooter>
  </div>
</template>
<style scoped>
.exp3part0 {
  width: 1178px;
  height: 680px;
  margin: 0 auto;
}
</style>
<script>
import headphotos from "../tripcomponents/headphotos";
import recommend from "../tripcomponents/recommend";
import imagetexts from "../tripcomponents/imagetexts";
import pagefooter from "../pagebottom/pagefooter";
import popdestination from "../tripcomponents/popdestination";
import photos from "../tripcomponents/photos";
import viewmore from "../tripcomponents/viewmore";
export default {
  components: {
    headphotos: headphotos,
    recommend: recommend,
    imagetexts: imagetexts,
    pagefooter: pagefooter,
    popdestination: popdestination,
    photos:photos,
    viewmore:viewmore,
  },
  data() {
    return {
      text1: {
        name: "为你推荐"
      },
      text2:{
        name:"热门目的地"
      },
      journey: [
        {
          pho: "/static/img/茅草我.d2724ed.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          type: "度假村｜",
          price: "￥8766起/人"
        },
        {
          pho: "/static/img/茅草我.d2724ed.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          type: "度假村｜",
          price: "￥8766起/人"
        },
        {
          pho: "/static/img/茅草我.d2724ed.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          type: "度假村｜",
          price: "￥8766起/人"
        },
        {
          pho: "/static/img/茅草我.d2724ed.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          type: "度假村｜",
          price: "￥8766起/人"
        },
        {
          pho: "/static/img/茅草我.d2724ed.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          type: "度假村｜",
          price: "￥8766起/人"
        },
        {
          pho: "/static/img/茅草我.d2724ed.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          type: "度假村｜",
          price: "￥8766起/人"
        }
      ]
    };
  }
};
</script>