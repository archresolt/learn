<template>
   <div class="index indexbox">
    <div class="equip_info equip_infobox_w equip_infobox_h">
        <NOV23></NOV23>
        <!-- 这里循环一个oneEQUIp -->
<!-- <div class="oneequip" v-for="item in equipments" :key="item"> -->
        <div class=" oneequip oneequipbox">
       
 <div class="equip_img equip_imgbox">
<img :src = "item.img" width="600px" height="230px"/> -->
      <!-- <img :src="trip1.pho" width="270px" height="180px" /> -->
<!-- </div>
<div class="equip_name equip_namebox underimg">
{{item.name}}
</div>
<div class="equip_price equip_pricebox gold">
{{"￥" + item.price}}
</div> --> http://localhost:8080  http://localhost:8080  http://localhost:8080  http://localhost:8080  http://localhost:8080  http://localhost:8080  http://localhost:8080  http://localhost:8080  http://localhost:8080  http://localhost:8080  http://localhost:8080  http://localhost:8080  http://localhost:8080  http://localhost:8080  http://localhost:8080  http://localhost:8080  http://localhost:8080    
        </div>
   
</div>
   </div>
</div>
 
</template>
<style scoped>
@import "../../assets/css/findgreat_distance.css";
@import "../../assets/css/findgreat_boxsize.css";
@import "../../assets/css/textstyle.css";
</style>
<script>
import  NOV23 from "./NOV23";
export default {
    components:{
NOV23:NOV23,
    },
 props:['e'],
    data(){
        return{
           equipments:[
               {
                img:"/static/img/行程首页切图/船舶",
                name:"日本潜水精工泳镜日本潜水精工泳镜",
                price:"1299.50",

            },  {
                img:"/static/img/行程首页切图/船舶",
                name:"日本潜水精工泳镜日本潜水精工泳镜",
                price:"1299.50",

            },
                       {
                img:"/static/img/行程首页切图/船舶",
                name:"日本潜水精工泳镜日本潜水精工泳镜",
                price:"1299.50",

            }, 
                       {
                img:"",
                name:"日本潜水精工泳镜日本潜水精工泳镜",
                price:"1299.50",

            }, 
                       {
                img:"",
                name:"日本潜水精工泳镜日本潜水精工泳镜",
                price:"1299.50",

            }, 
                       {
                img:"",
                name:"日本潜水精工泳镜日本潜水精工泳镜",
                price:"1299.50",

            }, 
                       {
                img:"",
                name:"日本潜水精工泳镜日本潜水精工泳镜",
                price:"1299.50",

            }, 
                       {
                img:"",
                name:"日本潜水精工泳镜日本潜水精工泳镜",
                price:"1299.50",

            }, 
                       {
                img:"",
                name:"日本潜水精工泳镜日本潜水精工泳镜",
                price:"1299.50",

            }, 
            ] 
        }
    }
}
</script>