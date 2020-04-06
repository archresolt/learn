<template>
  <div>
    <el-row style="height:100px;top:100px;">
      <el-col :span="1" class="bo"></el-col>
      <el-col :span="12" :offset="2" class="bo">
        <el-row class="br"></el-row>
        <el-row class="br">
          <el-col :span="3" class="bo">
              <el-button style="width:100%">按钮</el-button>
          </el-col>
          <el-col :span="6" :offset="1" class="bo"></el-col>
        </el-row>
      </el-col>
      <el-col :span="4" :offset="2" class="bo"></el-col>
    </el-row>
    <el-row style="height:100px"></el-row>
    <el-row style="height:100px"></el-row>
  </div>
</template>
<style scoped>
.br {
  height: 50%;
  box-shadow: 0 0 1px 1px blue;
}
.bo {
  box-shadow: 0 0 1px 1px red;
  height: 100%;
}
.exp2part0 {
  width: 1440px;
  margin: 0 auto;
  height: 1265px;
}
.exp2part1 {
  height: 95px;
  width: 840px;
  margin-left: 120px;
  float: left;
  /* background:green; */
}
.exp2part2 {
  width: 840px;
  height: 1170px;
  float: left;
  margin-left: 120px;
  /* background: red; */
}
.exp2part3 {
  width: 288px;
  height: 754px;
  background: rgba(248, 249, 250, 1);
  float: left;
  margin-left: 42px;
  margin-top: -63px;
}
</style>
<script>
import phos from "../community1components/phos";
import photext from "../community1components/photext";
import divesite from "../community1components/divesite";
import hotlist from "../community1components/hotlist";
import turnpage from "../community1components/turnpage";
import pagefooter from "../pagebottom/pagefooter";
export default {
  components: {
    phos: phos,
    photext: photext,
    divesite: divesite,
    hotlist: hotlist,
    turnpage: turnpage,
    pagefooter: pagefooter
  }
};
</script>