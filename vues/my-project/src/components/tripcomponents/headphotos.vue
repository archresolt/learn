<template>

    <div class="part2">
      <!-- :class="mus===0?'img2':'img1' " @mouseenter.stop="page=0" -->
      <div @click.stop="select('boat')" class="part2-1" :class="attractionstype === 'boat'?'img2':'img1' " >
          <img src = "@/assets/image/行程首页切图/58a29f1e15374.png"/>
        <div class="part2-1-4">船宿</div>
      </div>
      <div @click.stop="select('vallage')" class="part2-2"  :class= "attractionstype === 'vallage'? 'img2':'img1'">

           <img src = "@/assets/image/行程首页切图/277344_wx.png"/>
        <div class="part2-1-3" >度假村</div>
      </div>
      <div @click.stop="select('oneday')" class="part2-3"  :class= "attractionstype === 'oneday'? 'img2':'img1'">
           <img src = "@/assets/image/行程首页切图/Group 2.png"/>
        <div class="part2-1-3">一日游</div>
      </div>
      <div @click.stop="select('dive')" class="part2-4" :class= "attractionstype === 'dive'? 'img2':'img1'">
           <img src = "@/assets/image/行程首页切图/385876_wx.png"/>
        <div class="part2-1-3">潜导团</div>
      </div>
      <div @click.stop="select('action')" class="part2-5" :class= "attractionstype === 'action'? 'img2':'img1'">
           <img src = "@/assets/image/行程首页切图/163513.png"/>
        <div class="part2-1-4">活动</div>
      </div>
      <div @click.stop="select('free')" class="part2-6" :class= "attractionstype === 'free'? 'img2':'img1'">
           <img src = "@/assets/image/行程首页切图/500617404_banner.png"/>
        <div class="part2-1-3">自由行</div>
      </div>
    </div>

</template>
<style scoped>
.img1{
  -webkit-filter:grayscale(100%);
  filter:grayscale(100%);
}
.img2{
    width: 168px;
  height: 168px;
}
.part {
  margin: 0 auto;
  width: 1440px;
  height: 3236px;
  position: relative;
}
.part2 {
  width: 1440px;
  height: 471px;
   margin: 0 auto;

  position: relative;
  background: rgba(248, 249, 250, 1);
}

.part2-1 {
  width: 168px;
  height: 168px;
  float: left;
  position: relative;
  margin-left: 182px;
  margin-top: 126px;
  /* background-image: url(/static/img/行程首页切图/58a29f1e15374.png); */
}

.part2-2 {
  width: 214px;
  height: 214px;
  float: left;
  position: relative;
  margin-left: 59px;
  margin-top: 92px;
  background-image: url(/static/img/行程首页切图/277344_wx.png);
}

.part2-3 {
  width: 147px;
  height: 147px;
  float: left;
  position: relative;
  margin-left: 28px;
  margin-top: 183px;
  background-image: url(/static/img/行程首页切图/benpao.png);
}

.part2-4 {
  width: 178px;
  height: 178px;
  float: left;
  position: relative;
  margin-left: 164px;
  margin-top: 76px;
  background-image: url(/static/img/行程首页切图/385876_wx.png);
}

.part2-5 {
  width: 104px;
  height: 104px;
  float: left;
  position: absolute;
  margin-left: 858px;
  margin-top: 257px;

  background-image: url(/static/img/行程首页切图/163513.png);
}

.part2-6 {
  width: 129px;
  height: 129px;
  float: left;
  position: relative;
  margin-left: 39px;
  margin-top: 214px;
  background-image: url(/static/img/行程首页切图/500617404_banner.png);
}


.part2-1-3 {
  font-size: 22px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(255, 255, 255, 1);
  line-height: 30px;
  width: 69px;
  height: 30px;

  top: 0;
  bottom: 0;
  right: 0;
  left: 0;
  margin: auto;
  position: absolute;
}

.part2-1-4 {
  font-size: 22px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(255, 255, 255, 1);
  line-height: 30px;
  width: 46px;
  height: 30px;

  top: 0;
  bottom: 0;
  right: 0;
  left: 0;
  margin: auto;
  position: absolute;
}
</style>
<script>
export default {
   props: ['attractionstype'],
  data() {
    return {
      mus: 0
    };
  },
  methods:{
    colordown(){
this.mus=0
    },
    select(type){
      this.$emit('change',type);
    }
  }
};
</script>