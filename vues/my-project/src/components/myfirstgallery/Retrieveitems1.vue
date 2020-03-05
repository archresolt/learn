<template>
  <div class="part">
    <!-- <div class="part1"></div> -->

    <div class="part0">
      <!-- <div class="part1-1">
        <div class="font1">主题</div>
        <div class="font1">目的地</div>
      </div>
     
      <div class="part1-2">
<div class="font2" v-for = "item in theme" v-bind:key = "item">
    <div class="font2" v-for = "it in item.classification"  v-bind:key = "it">{{it}}</div>
</div>
      </div>-->
      <div class="part0-1"  v-for="item in theme" v-bind:key="item" :class= "this.type == 'item' ?'bakgrud1':'bakgrud2'"  @click="changeit(item)" >
        <span class="font1">{{item.name}}</span>
        <div class="font2" v-for="it in item.classification" v-bind:key="it">{{it}}</div>
      </div>

      <div class="part0-2">
        <span class="font1">目的地</span>
      </div>

      <div class="part0-3">
 <div class="part0-3-1" v-for ="item in trip" v-bind:key ="item">
    <span class="font1">{{item.name}}</span> 
    <div class="font2" v-for ="it in item.place" v-bind:key ="it">{{it}}</div>
 </div>
    </div>
  </div>
  </div>
</template>
<style scoped>
.bakgrud1{
  background:red;
}
.bakgrud2{
  background:white;
}
.part0-1 {
  width: 1290px;
  height: 52px;
  background: rgba(248, 249, 250, 1);
  float: left;
}
.part0-2 {
  width: 71px;
  height: 359px;
  background: rgba(248, 249, 250, 1);
  float: left;
}
.part0-3 {
  width: 1219px;
  height: 359px;
  background: rgba(248, 249, 250, 1);
  float: left;
}
.part0-3-1{
    width: 1219px;
 
  background: rgba(248, 249, 250, 1);
  float: left;
}
.font1 {
  font-size: 16px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(27, 27, 27, 1);
  line-height: 52px;
  position: relative;
  float: left;
}
.font2 {
  font-size: 16px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(144, 144, 144, 1);

  line-height: 52px;
  position: relative;
  float: left;
  margin-left: 38px;
}
.font3 {
font-size: 16px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(144, 144, 144, 1);

  line-height: 42px;
  position: relative;
  float: left;
  margin-left: 38px;
}

.part1-1 {
  width: 86px;
  height: 411px;
  background: rgba(248, 249, 250, 1);
  float: left;
}
.part1-2 {
  width: 1204px;
  height: 411px;
  background: rgba(248, 249, 250, 1);
  float: left;
}
.part {
  width: 1440px;
  height: 474px;
  background: rgba(248, 249, 250, 1);
  margin: 0 auto;
}
.part0 {
  width: 1290px;
  height: 411px;
  background: rgba(248, 249, 250, 1);
  margin-left: 150px;

  position: absolute;
}
.part1 {
  width: 536px;
  height: 46px;
  background: rgba(255, 255, 255, 1);
  border-radius: 23px;
  position: absolute;
  margin-left: 150px;
  margin-top: 40px;
}
</style>
<script>
export default {
  methods:{
 changeit:function(item){
this.type = item;
  },
  },
 
  data() {
    return {
      type:1,
      contry:2,
      theme: [
        {
          name: "主题",
          classification: ["度假村", "一日游", "船宿", "潜导团", "活动"]
        }
      ],

      trip: [
        {
          name: "亚洲",
          place: [
            "泰国",
            "马来西亚",
            "菲律宾",
            "马尔代夫",
            "印尼",
            "美娜多",
            "清迈",
            "马尔代夫",
            "清迈",
            "蓝碧海峡",
            "马来西亚",
            "菲律宾",
            "马尔代夫",
            "印尼",
            "美娜多"
          ]
        },
        {
          name: "欧洲",
          place: [
            "西米兰岛",
            "迦南岛",
            "科莫多",
            "兰卡威",
            "帕劳",
            "薄荷岛",
            "班达海",
            "舰港",
            "关岛",
            "苏梅岛"
          ]
        },
        {
          name: "非洲",
          place: ["菲律宾", "马尔代夫", "印尼", "清迈", "四王岛"]
        },
        {
          name: "北美",
          place: ["马尔代夫", "印尼", "拉秧拉秧岛"]
        },
        {
          name: "南美",
          place: [
            "菲律宾",
            "马尔代夫",
            "印尼",
            "美娜多",
            "清迈",
            "清迈",
            "夏威夷"
          ]
        },
        {
          name: "大洋洲",
          place: [
            "妈妈拍丝瓜岛",
            "甲米岛",
            "涛岛",
            "沙巴州",
            "PG岛",
            "南迪",
            "丫批"
          ]
        },
        {
          name: "南极洲",
          place: [
            "芭提岛",
            "伯利兹",
            "北极",
            "科科斯岛",
            "美里",
            "密克罗尼西亚群岛"
          ]
        }
      ]
    };
  }
};
</script>