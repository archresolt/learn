<template>
  <div class="oneCmmui">
    <div class="recmd-cmmui">
      <div style = "margin-left:30px;padding-top:46px">
      <el-row style="height:69px">
        <div class="name">{{recmdCmmui.name}}</div>
      </el-row>
      <el-row style="height:20px">
        <div class="type1">
        <img src = "/static/img/indexFirst/images1/biaoqian-3.png">
        </div>
        <div class="type">{{recmdCmmui.type}}</div>
      </el-row>
      <el-row style="height:180px">
        <el-col :span="16">
          <div class="pho">
            <img :src="recmdCmmui.pho" style=" width:180px;height:180px;" />
          </div>
        </el-col>

        <el-col :span="4" >
          <el-row style="height:70px"></el-row>
          <div class="readnum">阅读 |{{ recmdCmmui.readnum}}</div>
          <div class="talknum" style="margin-top:13px">评论 |{{ recmdCmmui.talknum}}</div>
          <div class="date">{{recmdCmmui.date}}</div>
        </el-col>
      </el-row>
    </div>
    </div>
  </div>
</template>
<script>
export default {
  props: ["recmdCmmui"]
};
</script>
<style scoped>
.oneCmmui {
  float: left;
  width: 370px;
  height: 370px;
  margin-left: 25px;
  margin-top: 20px;
}
.recmd-cmmui {
  width: 370px;
  height: 370px;
  /* background:rgba(255,255,255,1); */
 
  border-radius: 16px;
  /* background: brown; */
}
.recmd-cmmui:hover{
   box-shadow: 0px 2px 20px 0px rgba(212, 212, 212, 0.5);
}
.name {
  width: 310px;
  height: 69px;
  font-size: 20px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(27, 27, 27, 1);
  line-height: 28px;
text-align: left;
  /* background: rgb(196, 57, 133); */
}
.type {
  width: 102px;
  height: 16px;
  font-size: 14px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(98, 151, 185, 1);
  line-height: 16px;
float: left;
  /* background: red; */
  margin-left: 8px;
}
.type1{
  width:11px;
height:10px;
float:left;

}
.pho {
  width: 180px;
  height: 180px;

  background: green;
}
.readnum {
  width: 90px;
  height: 12px;
  font-size: 14px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(144, 144, 144, 1);
  line-height: 12px;
text-align: left;
  /* background: blue; */
}
.talknum {
  width: 90px;
  height: 12px;
  font-size: 14px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(144, 144, 144, 1);
  line-height: 12px;
  text-align: left;

  /* background: yellow; */
}
.date {
  margin-top:66px ;
  width: 120px;
  height: 12px;
  font-size: 14px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(144, 144, 144, 1);
  line-height: 12px;
  text-align: left;
  /* background: black; */
}
</style>