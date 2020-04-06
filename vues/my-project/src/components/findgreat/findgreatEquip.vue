<template>
  <div>
    <!-- onmouseenter -->

    <!-- <div class="index indexbox">
    <div class="equip_info equip_infobox_w equip_infobox_h">
    <NOV23></NOV23>-->
    <!-- 这里循环一个oneEQUIp -->
    <!-- <div class="oneequip" v-for="item in equipments" :key="item"> -->
    <!-- <div class="oneequip oneequipbox">
        <div class="equip_img equip_imgbox">
    <img :src="item.img" width="600px" height="230px" />-->
    <!-- <img :src="trip1.pho" width="270px" height="180px" /> -->
    <!-- </div>
<div class="equip_name equip_namebox underimg">
{{item.name}}
</div>
<div class="equip_price equip_pricebox gold">
{{"￥" + item.price}}
    </div>-->
    <!-- </div>
      </div>
    </div>
    </div>-->
    <div>
      <NOV23 style="margin-bottom:24px;"></NOV23>
    </div>
    <div class="equipPho">
      <div class="oneEquip" v-for="(item,index) in equipments" :key="index"  @mouseenter="turn(item.num)" @mouseleave="turn(0)">
        <div class="equipPhoSelf" style="width:100%;height:230px;" >
          
          <img :src="item.img" style="width:600px;height:230px;">
                <!-- <img :src="trip1.pho" width="270px" height="180px" /> -->
          <!-- <img src = "static/img/findGreat/205.4800.07.png"> -->
          <div class="buyQuickly" v-if="current==item.num" @click="jump('/equipInfo')"   >
                  立即购买
          </div>
          <div class="topImg" v-if="item.num<4">
             <div class="topText">
               top
             </div>
             <div class="topText2">
               {{index+1}}
             </div>
          </div>
        </div>
        <div class="description">
          <div class="desText" style="width:439px;">{{item.name}}</div>
          <div class="priceText">
        {{"￥"+ item.price}}
           
            </div>
        </div>
      </div>
    </div>
    <div></div>
  </div>
</template>
<script>
import NOV23 from "./NOV23";
export default {
  components: {
    NOV23: NOV23
  },
  props: ["e"],
   methods:{
    turn(num){
      this.current = num;
      // console.log("aaaaa");
    },
        jump(path, number) {
            this.$router.push(path)
            //方法体
            this.current = number;
            console.log(this.$router);
        },
  },
  data() {
    return {
      current:"",
      equipments: [
        {
          img: "static/img/findGreat/205.4800.07.png",
          name: "日本潜水精工泳镜日本潜水精工泳镜",
          price: "1299.50",
          num:1,
        },
        {
          img: "static/img/03.28补图/205.4800.07 copy.png",
          name: "日本潜水精工泳镜日本潜水精工泳镜",
          num:2,
          price: "1299.50"
        },
        {
          img: "static/img/findGreat/205.4800.07 copy 2.png",
          name: "日本潜水精工泳镜日本潜水精工泳镜",
          num:3,
          price: "1299.50"
        },
        {
          img: "static/img/findGreat/205.4800.07 copy 3.png",
          name: "日本潜水精工泳镜日本潜水精工泳镜",
          num:4,
          price: "1299.50"
        },
        {
          img: "static/img/findGreat/205.4800.07 copy 4.png",
          name: "日本潜水精工泳镜日本潜水精工泳镜",
          num:5,
          price: "1299.50"
        },
   
        {
          img: "static/img/findGreat/205.4800.07 copy 7.png",
          name: "日本潜水精工泳镜日本潜水精工泳镜",
          num:6,
          price: "1299.50"
        },
        {
          img: "static/img/findGreat/205.4800.07 copy 5.png",
          name: "日本潜水精工泳镜日本潜水精工泳镜",
          num:7,
          price: "1299.50"
        },
        {
          img: "static/img/findGreat/205.4800.07 copy 6.png",
          name: "日本潜水精工泳镜日本潜水精工泳镜",
          num:8,
          price: "1299.50"
        }
      ]
    };
  }
};
</script>

<style scoped>
@import "../../assets/css/findgreat_distance.css";
@import "../../assets/css/findgreat_boxsize.css";
@import "../../assets/css/textstyle.css";

.equipPho {
  width: 600px;
  height: 3106px;
  margin: 0 auto;
  /* background: lightcoral; */
}
.oneEquip {
  width: 600px;
  height: 300px;
  /* background: lightgreen; */
  margin-bottom: 80px;
}
.equipPhoSelf:hover{

  box-shadow:0px 2px 20px 0px rgba(161,161,161,0.5);
}
.topImg{
  width:50px;
height:86px;
background:rgba(223,32,32,1);
opacity:0.8;
position: absolute;
margin-top:-255px;
margin-left: 0px;
}
.topText{
  margin-top:20px;
    width:56px;
height:20px;
font-size:14px;
font-family:Helvetica;
color:rgba(255,255,255,1);
line-height:17px;
letter-spacing:1px;
}
.topText2{
  width:56px;
height:30px;
font-size:24px;
font-family:Helvetica;
color:rgba(255,255,255,1);
line-height:27px;
letter-spacing:1px;
text-align: left;
/* margin-top:10px; */
margin-left: 15px;
}
.buyQuickly{
   cursor: pointer;
  width:141px;
height:40px;
background:rgba(194,119,54,1);
border-radius:20px;
opacity:0.9;
font-size:18px;
font-family:PingFangSC-Regular,PingFang SC;
font-weight:400;
color:rgba(255,255,255,1);
line-height:40px;
letter-spacing:3px;
position: absolute;
margin-top:-60px;
margin-left: 437px;
}

.desText {
  font-size: 20px;
  font-family: PingFangSC-Medium, PingFang SC;
  font-weight: 500;
  color: rgba(27, 27, 27, 1);
  line-height: 36px;
  text-align: left;
  height: 60px;
  margin-top: 10px;
  float: left;
  /* text-align: center; */
}
.priceText {
  height: 50px;
  margin-top: 20px;
  font-size: 12px;
  font-family: PingFangSC-Medium, PingFang SC;
  font-weight: 500;
  color: rgba(194, 119, 54, 1);
  line-height: 17px;
  letter-spacing: 1px;
  float: left;
  margin-left: 50px;
}
</style>
