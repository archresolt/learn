<template>
  <div>
    <headphotos :attractionstype="active" @change="typeChanged"></headphotos>
    <recommend :name="`为你推荐`"></recommend>
    <!-- 图文景点，由于是固定的两个，所以一个组件解决 -->
    <imagetexts :contents="imageList1"></imagetexts>
    <!-- 次要景点，由于是固定的三个，所以一个组件解决 -->
    <photos :contents="imageList2"></photos>
    <recommend :name="`热门目的地`"></recommend>
    <!-- 热门景点 -->
    <div class="exp3part0">
      <popdestination :trip1="item" v-for="item in others" :key="item.name"></popdestination>
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
  mounted() {
    //这里之后加载数据，使用axios
    console.log(this);
  },
  methods: {
    typeChanged(type) {
      this.active = type;
    }
  },
  components: {
    headphotos: headphotos,
    recommend: recommend,
    imagetexts: imagetexts,
    pagefooter: pagefooter,
    popdestination: popdestination,
    photos: photos,
    viewmore: viewmore
  },
  computed: {
    imageList1() {
      let journeyList = this[this.active];
      return [journeyList[0], journeyList[1], journeyList[2], journeyList[3]];
    },
    imageList2() {
      let journeyList = this[this.active];
      return [journeyList[2], journeyList[3], journeyList[4]];
    },
    others() {
      // this.boat
      // this['boat']
      let journeyList = this[this.active];
      return journeyList.splice(5, 6);
    }
  },
  data() {
    return {
      active: "boat",
      boat: [
        {
          name: "印度尼西亚·普吉岛·白珍珠度假村 | 丰富水下生物 探秘水下沉船",
          address: "普吉岛",
          description:
            "普吉岛，位于泰国的南部，与普吉岛隔海相望，犹如天堂般的热带半岛，是安达曼海岸边最美丽的地方…",
          type: "船宿",
          price: "1766",
          pho: "/static/img/行程首页切图/船舶.png"
        },
        {
          name: "马来西亚·邦邦岛·白珍珠度假村 | 丰富水下生物 探秘水下沉船",
          address: "甲米岛",
          description:
            "甲米岛，位于泰国的南部，与普吉岛隔海相望，犹如天堂般的热带半岛，是安达曼海岸边最美丽的地方…",
          type: "船宿",
          price: "8766",
          pho: "/static/img/行程首页切图/日出.png"
        },
        {
          name: "日本·邦邦岛·白珍珠度假村 | 丰富水下生物 探秘水下沉船",
          address: "甲米岛",
          description:
            "甲米岛，位于泰国的南部，与普吉岛隔海相望，犹如天堂般的热带半岛，是安达曼海岸边最美丽的地方…",
          type: "船宿",
          price: "8766",
          pho: "/static/img/行程首页切图/日出.png"
        },
        {
          name: "韩国·邦邦岛·白珍珠度假村 | 丰富水下生物 探秘水下沉船",
          address: "甲米岛",
          description:
            "甲米岛，位于泰国的南部，与普吉岛隔海相望，犹如天堂般的热带半岛，是安达曼海岸边最美丽的地方…",
          type: "船宿",
          price: "8766",
          pho: "/static/img/行程首页切图/海边.png"
        },
        {
          name: "朝鲜·邦邦岛·白珍珠度假村 | 丰富水下生物 探秘水下沉船",
          address: "甲米岛",
          description:
            "甲米岛，位于泰国的南部，与普吉岛隔海相望，犹如天堂般的热带半岛，是安达曼海岸边最美丽的地方…",
          type: "船宿",
          price: "8766",
          pho: "/static/img/行程首页切图/海底.png"
        },
         {
          pho: "static/img/行程首页切图/房子.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },
          {
          name: "朝鲜·邦邦岛·白珍珠度假村 | 丰富水下生物 探秘水下沉船",
          address: "甲米岛",
          description:
            "甲米岛，位于泰国的南部，与普吉岛隔海相望，犹如天堂般的热带半岛，是安达曼海岸边最美丽的地方…",
          type: "船宿",
          price: "8766",
          pho: "/static/img/行程首页切图/海底.png"
        },
        {
          pho: "/static/img/行程首页切图/船舶.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },
          {
          pho: "static/img/行程首页切图/房子.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },
      {
          name: "朝鲜·邦邦岛·白珍珠度假村 | 丰富水下生物 探秘水下沉船",
          address: "甲米岛",
          description:
            "甲米岛，位于泰国的南部，与普吉岛隔海相望，犹如天堂般的热带半岛，是安达曼海岸边最美丽的地方…",
          type: "船宿",
          price: "8766",
          pho: "/static/img/行程首页切图/海底.png"
        },
            {
          name: "马来西亚·邦邦岛·白珍珠度假村 | 丰富水下生物 探秘水下沉船",
          address: "甲米岛",
          description:
            "甲米岛，位于泰国的南部，与普吉岛隔海相望，犹如天堂般的热带半岛，是安达曼海岸边最美丽的地方…",
          type: "船宿",
          price: "8766",
          pho: "/static/img/行程首页切图/日出.png"
        },
      ],
      vallage: [
        {
          pho: "/static/img/行程首页切图/船舶.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          description:
            "甲米岛，位于泰国的南部，与普吉岛隔海相望，犹如天堂般的热带半岛，是安达曼海岸边最美丽的地方…",
          type: "度假村",
          price: "8766",
          address: "甲米岛"
        },
        {
          pho: "/static/img/行程首页切图/船舶.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          description:
            "甲米岛，位于泰国的南部，与普吉岛隔海相望，犹如天堂般的热带半岛，是安达曼海岸边最美丽的地方…",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },
        {
          pho: "static/img/行程首页切图/房子.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },
        {
          pho: "/static/img/行程首页切图/船舶.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },
        {
          pho: "/static/img/行程首页切图/船舶.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },
        {
          pho: "/static/img/行程首页切图/船舶.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },
         {
          name: "印度尼西亚·普吉岛·白珍珠度假村 | 丰富水下生物 探秘水下沉船",
          address: "普吉岛",
          description:
            "普吉岛，位于泰国的南部，与普吉岛隔海相望，犹如天堂般的热带半岛，是安达曼海岸边最美丽的地方…",
          type: "船宿",
          price: "1766",
          pho: "/static/img/行程首页切图/船舶.png"
        },
        {
          name: "马来西亚·邦邦岛·白珍珠度假村 | 丰富水下生物 探秘水下沉船",
          address: "甲米岛",
          description:
            "甲米岛，位于泰国的南部，与普吉岛隔海相望，犹如天堂般的热带半岛，是安达曼海岸边最美丽的地方…",
          type: "船宿",
          price: "8766",
          pho: "/static/img/行程首页切图/日出.png"
        },
        {
          name: "日本·邦邦岛·白珍珠度假村 | 丰富水下生物 探秘水下沉船",
          address: "甲米岛",
          description:
            "甲米岛，位于泰国的南部，与普吉岛隔海相望，犹如天堂般的热带半岛，是安达曼海岸边最美丽的地方…",
          type: "船宿",
          price: "8766",
          pho: "/static/img/行程首页切图/日出.png"
        },
        {
          name: "韩国·邦邦岛·白珍珠度假村 | 丰富水下生物 探秘水下沉船",
          address: "甲米岛",
          description:
            "甲米岛，位于泰国的南部，与普吉岛隔海相望，犹如天堂般的热带半岛，是安达曼海岸边最美丽的地方…",
          type: "船宿",
          price: "8766",
          pho: "/static/img/行程首页切图/海边.png"
        },
        {
          name: "朝鲜·邦邦岛·白珍珠度假村 | 丰富水下生物 探秘水下沉船",
          address: "甲米岛",
          description:
            "甲米岛，位于泰国的南部，与普吉岛隔海相望，犹如天堂般的热带半岛，是安达曼海岸边最美丽的地方…",
          type: "船宿",
          price: "8766",
          pho: "/static/img/行程首页切图/海底.png"
        },
       {
          pho: "/static/img/行程首页切图/船舶.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          description:
            "甲米岛，位于泰国的南部，与普吉岛隔海相望，犹如天堂般的热带半岛，是安达曼海岸边最美丽的地方…",
          type: "度假村",
          price: "8766",
          address: "甲米岛"
        },
      ],
      oneday: [
         {
          pho: "/static/img/行程首页切图/船舶.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          description:
            "甲米岛，位于泰国的南部，与普吉岛隔海相望，犹如天堂般的热带半岛，是安达曼海岸边最美丽的地方…",
          type: "度假村",
          price: "8766",
          address: "甲米岛"
        },
        {
          pho: "static/img/行程首页切图/海边.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          description:
            "甲米岛，位于泰国的南部，与普吉岛隔海相望，犹如天堂般的热带半岛，是安达曼海岸边最美丽的地方…",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },
        {
          pho: "static/img/行程首页切图/房子.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },
        {
          pho: "static/img/行程首页切图/海边.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },
        {
          pho: "/static/img/行程首页切图/船舶.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },
        {
          pho: "/static/img/行程首页切图/船舶.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },
            {
          pho: "static/img/行程首页切图/日出.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          description:
            "甲米岛，位于泰国的南部，与普吉岛隔海相望，犹如天堂般的热带半岛，是安达曼海岸边最美丽的地方…",
          type: "度假村",
          price: "8766",
          address: "甲米岛"
        },
        {
          pho: "/static/img/行程首页切图/船舶.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          description:
            "甲米岛，位于泰国的南部，与普吉岛隔海相望，犹如天堂般的热带半岛，是安达曼海岸边最美丽的地方…",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },
        {
          pho: "static/img/行程首页切图/房子.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },
        {
          pho: "/static/img/行程首页切图/船舶.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },
               {
          pho: "static/img/行程首页切图/日出.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },
        
      ],
      action: [
         {
          pho: "static/img/行程首页切图/房子.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          description:
            "甲米岛，位于泰国的南部，与普吉岛隔海相望，犹如天堂般的热带半岛，是安达曼海岸边最美丽的地方…",
          type: "度假村",
          price: "8766",
          address: "甲米岛"
        },
        {
          pho: "/static/img/行程首页切图/船舶.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          description:
            "甲米岛，位于泰国的南部，与普吉岛隔海相望，犹如天堂般的热带半岛，是安达曼海岸边最美丽的地方…",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },
        {
          pho: "static/img/行程首页切图/房子.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },
        {
          pho: "/static/img/行程首页切图/船舶.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },
        {
          pho: "static/img/行程首页切图/房子.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },
        {
          pho: "/static/img/行程首页切图/船舶.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },
       {
          pho: "static/img/行程首页切图/海底.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          description:
            "甲米岛，位于泰国的南部，与普吉岛隔海相望，犹如天堂般的热带半岛，是安达曼海岸边最美丽的地方…",
          type: "度假村",
          price: "8766",
          address: "甲米岛"
        },
        {
          pho: "/static/img/行程首页切图/船舶.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          description:
            "甲米岛，位于泰国的南部，与普吉岛隔海相望，犹如天堂般的热带半岛，是安达曼海岸边最美丽的地方…",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },
        {
          pho: "static/img/行程首页切图/海底.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },
        {
          pho: "/static/img/行程首页切图/船舶.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },
        {
          pho: "/static/img/行程首页切图/船舶.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },
      
      ],
      dive: [
         {
          pho: "static/img/行程首页切图/海底.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          description:
            "甲米岛，位于泰国的南部，与普吉岛隔海相望，犹如天堂般的热带半岛，是安达曼海岸边最美丽的地方…",
          type: "度假村",
          price: "8766",
          address: "甲米岛"
        },
        {
          pho: "/static/img/行程首页切图/船舶.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          description:
            "甲米岛，位于泰国的南部，与普吉岛隔海相望，犹如天堂般的热带半岛，是安达曼海岸边最美丽的地方…",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },
        {
          pho: "static/img/行程首页切图/海底.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },
        {
          pho: "/static/img/行程首页切图/船舶.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },
        {
          pho: "/static/img/行程首页切图/船舶.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },
        {
          pho: "static/img/行程首页切图/海底.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },
       {
          pho: "/static/img/行程首页切图/船舶.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          description:
            "甲米岛，位于泰国的南部，与普吉岛隔海相望，犹如天堂般的热带半岛，是安达曼海岸边最美丽的地方…",
          type: "度假村",
          price: "8766",
          address: "甲米岛"
        },
        {
          pho: "static/img/行程首页切图/海边.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          description:
            "甲米岛，位于泰国的南部，与普吉岛隔海相望，犹如天堂般的热带半岛，是安达曼海岸边最美丽的地方…",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },
        {
          pho: "static/img/行程首页切图/房子.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },
        {
          pho: "static/img/行程首页切图/海边.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },
        {
          pho: "/static/img/行程首页切图/船舶.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },
        {
          pho: "/static/img/行程首页切图/船舶.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },
       
      ],
      free: [
         {
          pho: "static/img/行程首页切图/日出.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          description:
            "甲米岛，位于泰国的南部，与普吉岛隔海相望，犹如天堂般的热带半岛，是安达曼海岸边最美丽的地方…",
          type: "度假村",
          price: "8766",
          address: "甲米岛"
        },
        {
          pho: "/static/img/行程首页切图/船舶.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          description:
            "甲米岛，位于泰国的南部，与普吉岛隔海相望，犹如天堂般的热带半岛，是安达曼海岸边最美丽的地方…",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },
        {
          pho: "static/img/行程首页切图/房子.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },
        {
          pho: "/static/img/行程首页切图/船舶.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },
        {
          pho: "static/img/行程首页切图/日出.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },
        {
          pho: "static/img/行程首页切图/日出.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },
    {
          pho: "static/img/行程首页切图/房子.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          description:
            "甲米岛，位于泰国的南部，与普吉岛隔海相望，犹如天堂般的热带半岛，是安达曼海岸边最美丽的地方…",
          type: "度假村",
          price: "8766",
          address: "甲米岛"
        },
        {
          pho: "/static/img/行程首页切图/船舶.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          description:
            "甲米岛，位于泰国的南部，与普吉岛隔海相望，犹如天堂般的热带半岛，是安达曼海岸边最美丽的地方…",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },
        {
          pho: "static/img/行程首页切图/房子.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },

        {
          pho: "static/img/行程首页切图/房子.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },
        {
          pho: "/static/img/行程首页切图/船舶.png",
          name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
          type: "度假村",
          address: "甲米岛",
          price: "8766"
        },
      ]
    };
  }
};
</script>
