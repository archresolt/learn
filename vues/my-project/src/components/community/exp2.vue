<template>
  <div class="testClass">
    <phos></phos>
    <div class="exp2part0">
      <div class="exp2part1">
        <divesite></divesite>
      </div>
      <div class="exp2part2">
        <photext></photext>
      </div>
      <div class="exp2part3">
        <hotlist></hotlist>
      </div>
    </div>
    <turnpage></turnpage>
    <pagefooter></pagefooter>
  </div>
</template>
<style scoped>
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