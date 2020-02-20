<template>
<div>
<div class="part">
  <div class="part1">
 <div class="part0">亚洲</div>
    <div class="part2">
      
     <div class="part1-3" v-for="item in nations" v-bind:key="item">{{item.name}}</div>

  </div>
   

      <!-- <div class="part1-3">泰国</div>
    <div class="part1-3">马来西亚</div>
    <div class="part1-3">菲律宾</div>
    <div class="part1-3">马尔代夫</div>
    <div class="part1-3">印尼</div>
    <div class="part1-3">美娜多</div>
    <div class="part1-3">清迈</div>
    <div class="part1-3">清迈</div>
    <div class="part1-3">马尔代夫</div>
    <div class="part1-3">清迈</div>
    <div class="part1-3">蓝碧海峡</div>

    <div class="part1-3 ">马来西亚</div>
    <div class="part1-3 ">菲律宾</div>
    <div class="part1-3 ">马尔代夫</div>
    <div class="part1-3 ">印尼</div>
      <div class="part1-3 ">美娜多</div>-->
    </div>
    <div class="part1" v-for="item in trip" v-bind:key="item">
<span class="font1">{{item.name}}</span>
  <div class="part1-3" v-for="place in item.place" v-bind:key="place">{{place}}</div>
    </div>
</div>
</div>
</template>
<style scoped>
.font1{
   font-size: 16px;
  font-family: STSongti-SC-Regular, STSongti-SC;
  font-weight: 400;
  color: rgba(27, 27, 27, 1);
  line-height: 42px;
  float: left;
  position: relative;
}
.part0 {
  width: 32px;
  height: 42px;

  font-size: 16px;
  font-family: STSongti-SC-Regular, STSongti-SC;
  font-weight: 400;
  color: rgba(27, 27, 27, 1);
  line-height: 42px;
  float: left;
  position: relative;
}
.part2 {
  width: 930px;

  position: relative;
  margin-left: 48px;
}
.part{
   width: 978px;
  height: 3000px;
  position: relative;
  margin-left: 236px;}
.part1 {
  width: 978px;
  height: 85px;
  position: relative;
  margin-left: 236px;
}

.part1-3 {
  position: relative;
  float: left;
  margin-left: 38px;
  font-size: 16px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(144, 144, 144, 1);
  line-height: 42px;
}
</style>
<script>
export default {
  data() {
    return {
      theme: [
        {
          name: "主题",
          classification: ["度假村", "一日游", "船宿", "潜导团", "活动"]
        }
      ],

      nations: [{ name: "中国" }, { name: "韩国" }, { name: "日本" }],

      trip: [
        {
          partof: "目的地",
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
          partof: "目的地",
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
          partof: "目的地",
          name: "非洲",
          place: ["菲律宾", "马尔代夫", "印尼", "清迈", "四王岛"]
        },
        {
          partof: "目的地",
          name: "北美",
          place: ["马尔代夫", "印尼", "拉秧拉秧岛"]
        },
        {
          partof: "目的地",

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
          partof: "目的地",
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
          partof: "目的地",
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
      //   region:[亚洲 ,欧洲,非洲,北美,南美,大洋洲,南极洲],
      // place1:[泰国,马来西亚,菲律宾,马尔代夫

      // ]
    };
  }
};
</script>