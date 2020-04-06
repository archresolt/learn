<template>
  <div>

    <div>
      <NOV23></NOV23>
    </div>
    <div class="appointment">
         <el-row class="first">
             <el-col :span = "9" offset="3" class= "phoTop" >
                 <div>
                     <img src ="static\img\findYuYue\Group 2@2x.png" style = "width: 340px; height: 427px;">
                 </div>
             </el-col>
               <el-col :span = "9"  offset="1" class="textTOP">
                   <div class="boxBlue"></div>
                   <div class="boxText1">你会喜欢有人为你预先打点，比如<span style = "font-size:28px;color:#6297B9">我们</span></div>
             </el-col>
         </el-row>
            <el-row class="second">
             <el-col :span = "9" offset="2"  class= "textBottom">
                   <div class="boxBlue"></div>
                   <div class="boxText1">全国<span style = "font-size:28px;color:#6297B9">23+</span>城市，<span style = "font-size:28px;color:#6297B9">78+</span>潜水馆，你可能不曾察觉，我们一直在你身边</div>
             </el-col>
               <el-col :span = "9"  offset="1"  class= "phoBottom">
                    <div style="   margin-left: 30px;">
                     <img src ="static\img\findYuYue\Group.png" style = "width: 340px; height: 427px;">
                 </div>
             </el-col>
         </el-row>
    </div>
    <div style="height:150px;background:#FFFFFF;"></div>
  </div>
</template>
<script>
export default {
    data(){
        return{

        }
    }
}
</script>
<style scoped>


.appointment {
  width: 830px;
  height: 1206px;
  margin: 0 auto;
  /* background: lightcoral; */
}
.first{
    height: 544px;
}
.second{
    height: 628px;
}
.phoTop{
    margin-top: 59px;
width: 340px;
  height: 427px;
}
.textTOP{
   margin-top: 59px;
width: 340px;
  height: 427px;
}
.boxBlue{
    margin-left: 20px;
    margin-top:186px;
    width:18px;
height:18px;
background:rgba(98,151,185,1);
}
.boxText1{
    margin-top:20px;
    margin-left:20px;
    width:288px;
height:110px;
font-size:20px;
font-family:PingFangSC-Regular,PingFang SC;
font-weight:400;
color:rgba(27,27,27,1);
line-height:28px;
text-align: left;
}
.textBottom{
    margin-top:20px;
    width:288px;
height:110px;
font-size:20px;
font-family:PingFangSC-Regular,PingFang SC;
font-weight:400;
color:rgba(27,27,27,1);
line-height:28px;
text-align: left;
}
.phoBottom{
    margin-top: 59px;
  
width: 340px;
  height: 427px;
}
</style>
