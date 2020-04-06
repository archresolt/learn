<template>
  <div>
    <div>
      <NOV23></NOV23>
    </div>
    <div class="daily">
        <!-- 第一层 -->
      <div class="top">
        <div class="topImg">
          <img src="static\img\findGoodDaily\rizhi1.png" style="width:100%;height:100%" />
        </div>
        <div class="topBox"></div>
        <div class="topText">
          <div style="height:40px">
            <span style="font-size:28px;color:#6297B9">快捷同步</span>
          </div>从琐碎的数据中脱身
        </div>
      </div>
<!-- 中间部分 -->
      <div class="middle">
          
        <div class="middleImg">
          <img src="static\img\findGoodDaily\rizhi2.png" style="width:100%;height:100%" />
        </div>
        <div class="middleBox"></div>
        <div class="middleText">
          <div style="height:40px">
            <span style="font-size:28px;color:#6297B9">日志认证</span>
          </div>这不是点赞，是潜友的相互见证
        </div>
        <div class="middle-mask">
        </div>
      </div>

<!-- 底部 -->
      <div class="bottom">
        <div class="bottomImg">
          <img src="static\img\findGoodDaily\rizhi3.png" style="width:100%;height:100%" />
        </div>
        <div class="bottomBox"></div>
        <div class="bottomText">
          <div style="height:40px">
            <span style="font-size:28px;color:#6297B9">创建潜点</span>
          </div>你忘记了很多初见时的欢喜，我们替你记得
        </div>
      </div>
    </div>
  </div>
</template>
<script>
export default {
  data() {
    return {};
  }
};
</script>
<style scoped>
.daily {
  width: 830px;
  height: 1434px;
}
.top {
  /* position: absolute; */
  width: 830px;
  height: 478px;
  background: rgba(248, 249, 250, 1);
}
.topImg {
  width: 272px;
  height: 366px;
  position: absolute;
  margin-left: 488px;
  margin-top: 61px;
}
.topBox {
  position: absolute;
  margin-left: 162px;
  margin-top: 152px;

  width: 18px;
  height: 18px;
  background: rgba(98, 151, 185, 1);
}
.topText {
  width: 192px;
  height: 68px;
  position: absolute;
  margin-left: 162px;
  margin-top: 190px;
  font-size: 20px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(27, 27, 27, 1);
  line-height: 38px;
  text-align: left;
}

.middle {
  /* position: absolute; */
  width: 830px;
  height: 478px;
  /* background: rgba(98, 151, 185, 1); */
  /* opacity: 0.1; */
}
.middle-mask{
   /* position: absolute; */
    left: 0;
    right: 0;
    top: 0;
    bottom: 0;
  width: 830px;
  height: 478px;
  background: rgba(98, 151, 185, 1);
  opacity: 0.1;
}

.middleImg {
  width: 340px;
  height: 307px;
  position: absolute;
  margin-left: 97px;
  margin-top: 91px;
}
.middleBox {
  position: absolute;
  margin-left: 465px;
  margin-top: 152px;

  width: 18px;
  height: 18px;
  background: rgba(98, 151, 185, 1);
}
.middleText {
  width: 311px;
  height: 68px;
  position: absolute;
  margin-left: 465px;
  margin-top: 190px;
  font-size: 20px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(27, 27, 27, 1);
  line-height: 38px;
  text-align: left;
}
.bottom {
  /* position: absolute; */
  width: 830px;
  height: 478px;
  background: rgba(248, 249, 250, 1);
}
.bottomImg {
  width: 355px;
  height: 355px;
  position: absolute;
  margin-left: 444px;
  margin-top: 72px;
}
.bottomBox {
  position: absolute;
  margin-left: 62px;
  margin-top: 162px;

  width: 18px;
  height: 18px;
  background: rgba(98, 151, 185, 1);
}
.bottomText {
  width: 410px;
  height: 68px;
  position: absolute;
  margin-left: 52px;
  margin-top: 200px;
  font-size: 20px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(27, 27, 27, 1);
  line-height: 38px;
  text-align: left;
}
</style>