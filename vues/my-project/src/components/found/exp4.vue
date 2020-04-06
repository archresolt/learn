<template>
  <div class="bodyBox">
    <!-- <div class="index indexbox">
    <div class=""-->

    <!-- 之前的练习 -->
    <!-- <div>
      <el-input v-model="appreance" placeholder="请输入你想说的" />
      <el-input placeholder="请输入你想说的" />
    </div>
    <br />
    <br />
    <div class="part0">
        <div class="part1">
      <span title="这是文字" :style = "{color:appreance}">文字的颜色可以改变</span>
        </div>
    </div>-->

    <!-- :a = "item" v-for ="item in equipments" :key = "item"  -->
    <div style="float:left"> 
    <div class="leftBox">
      <findgreatEquip v-if="currentTitle=='zhuangbei'"></findgreatEquip>
      <findgreatCourse v-if ="currentTitle=='kecheng'"></findgreatCourse>
      <findgreatAppointment v-if ="currentTitle =='yuyue'"></findgreatAppointment>
      <beauty v-if ="currentTitle =='meihua'"></beauty>
      <daily  v-if ="currentTitle =='rizhi'"></daily>
    </div>
    <div class="rightBox">
      <!-- 右边的发现精彩几个字 -->
      <div class="findGood" style="height:30px;margin-left:57px;margin-top:48px">
        <el-row style="height:30px">
          <el-col :span="3" style="height:30px">
            <img
              src="static\img\findGreat\found.png"
              style="width:30px;height:30px"
            />
          </el-col>
          <el-col :span="5" style="height:30px">
            <h class="findGoodText">发现精彩</h>
          </el-col>
        </el-row>
      </div>
      <!-- 右边的五个标题栏 -->
      <div class="findGoodTitle">
        <!-- class="titleSelf" -->
        <div  v-for="item in findGoodTitles" :key="item.title" @click="change(item.name,item.num)" :class="current==item.num?'titleSelf2':'titleSelf'">
          <div class="logoPoint"></div>
          <div class="titleText">{{item.title}}</div>
        </div>
      </div>

      <div class="twoCode">
        <img src="static\img\findGreat\Bitmap.png" />
      </div>
      <div class="twoCodeDes">扫描下载「一个关于潜水的内容异常多的神奇」app</div>
    </div>
  </div>
    <pagefooter style="float:left;margin-top:20px "></pagefooter>
  </div>
</template>
<script>
import findgreatEquip from "../findgreat/findgreatEquip";
import findgreatCourse from "../findgreat/findgreatCourse";
import findgreatAppointment from "../findgreat/findgreatAppointment";
import pagefooter from "../pagebottom/pagefooter";
import beauty from "../findgreat/beauty";
import daily from "../findgreat/daily";
export default {
  components: {
    findgreatEquip: findgreatEquip,
    findgreatCourse:findgreatCourse,
    findgreatAppointment:findgreatAppointment,
    pagefooter:pagefooter,
    beauty:beauty,
    daily:daily,
  },
   methods:{
        change(type,num){
      this.currentTitle = type;
      this.current = num;
        },
        // jump(city){
        //    this.currentCity = city; 
        // }
    
    
},
  data() {
    return {
      appreance: "red",
      currentTitle:"kecheng",
      current:"",
      findGoodTitles: [
        {
          title: "商城.装备",
          name:"zhuangbei",
          num:1,
        },
        {
          title: "商城.课程",
            num:2,
          name:"kecheng"
        },
        {
          title: "商城.预约",
            num:3,
          name:"yuyue"
        },
        {
          title: "商城.日志",
            num:4,
           name:"rizhi",
        },
        {
          title: "商城.美化",
            num:5,
            name:"meihua",
        }
      ]
    };
  }
};
</script>
<style scoped>
@import "../../assets/css/findgreat_distance.css";
@import "../../assets/css/findgreat_boxsize.css";
.bodyBox {
  width: 1440px;
  margin: 0 auto;
}

.leftBox {
  width: 830px;
  /* height: 1800px; */
  /* background: blue; */
 background:rgba(248,249,250,1);
  margin-left: 150px;
  float: left;
}
.rightBox {
  width: 460px;
  float: right;
}
.findGoodText {
  font-size: 18px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(27, 27, 27, 1);
  line-height: 25px;
}
.findGoodTitle {
  margin-top: 54px;
  margin-left: 44px;
  height: 330px;
  width: 188px;
  /* background:blueviolet; */
}
.titleSelf {
  width: 188px;
  height: 40px;
  /* background:rgba(98,151,185,1); */
  border-radius: 20px;
  opacity: 0.4;
  margin-bottom: 26px;
  transition: background 0.4s linear, color 0.3s linear;
   cursor:default;
}
.titleSelf2{
    background: rgba(98, 151, 185, 1);
     width: 188px;
  height: 40px;
  /* background:rgba(98,151,185,1); */
  border-radius: 20px;
  opacity: 0.4;
  margin-bottom: 26px;
  transition: background 0.4s linear, color 0.3s linear;
   cursor:default;
}
.titleSelf:hover {
  background: rgba(98, 151, 185, 1);
}
.logoPoint {
  position: absolute;
  width: 6px;
  height: 6px;
  border-radius: 3px;
  background: blue;
  margin-top: 17px;
  margin-left: 34px;
}
.titleText {
  width: 80px;
  height: 40px;
  font-size: 18px;
  font-family: PingFangSC-Medium, PingFang SC;
  font-weight: 500;
  color: black;
  line-height: 40px;
  margin-left: 65px;
}
.twoCode {
  width: 163px;
  height: 163px;
  margin-left: 77px;
  margin-top: 26px;
}
.twoCodeDes {
  width: 270px;
  height: 94px;
  font-size: 20px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(144, 144, 144, 1);
  line-height: 30px;
  margin-left: 77px;
  margin-top: 21px;
  text-align: left;
}
</style>
