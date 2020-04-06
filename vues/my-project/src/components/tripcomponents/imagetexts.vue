<template>
  <div class="part3">
    <div style="position:relative;width:100%;height:760px; overflow:hidden;">
      <div style="position:relative;width:200vw;transition:transform .2s;" :style="splitePanelStyle">
       <!-- 第一页 -->
        <div class="it-panel">
          <div style="position:relative;width:100%;">
            <div class="part3-a">
              <div class="part3-3">
                {{content0.name}}
                <!-- 马来西亚·邦邦岛·白珍珠度假村 | 丰富水下生物 探秘水下沉船 -->
              </div>
              <div class="part3-4">
                <img src="@/assets/image/行程首页切图/Shape.png" />
              </div>
              <div class="part3-5">{{content0.address}}</div>
              <div class="part3-6"></div>
              <div class="part3-7">{{content0.description}}</div>
              <div class="part3-8">
                <img src="@/assets/image/行程首页切图/主题 copy.png" />
              </div>
              <div class="part3-9">{{content0.type}} |</div>
              <div class="part3-10">
                <span style="font-size:12px ;">￥</span>
                <span style="font-size:20px ;">{{content0.price}}</span>
                <span style="font-size: 12px;">起/人</span>
              </div>
              <div class="part3-11">
                <div class="part3-11-1">详情</div>
              </div>
            </div>

            <div class="part4">
              <img :src="content0.pho" style="width:100%;height:100%;">
            </div>
          </div>
          <div style="position:relative;width:100%;">
            <div class="part5">
              <img :src="content1.pho" style="width:100%;height:100%;">
            </div>
            <div class="part3-a-1">
              <div class="part3-3">{{content1.name}}</div>
              <div class="part3-4">
                <img src="@/assets/image/行程首页切图/Shape.png" />
              </div>
              
              <div class="part3-5">{{content1.address}}</div>
              <div class="part3-6"></div>
              <div class="part3-7">{{content1.description}}</div>


              <div class="part3-8">
                <img src="@/assets/image/行程首页切图/主题 copy.png" />
              </div>
              <div class="part3-9">{{content1.type}} |</div>
  <!-- <div class="part3-8">
                <img src="@/assets/image/行程首页切图/主题 copy.png" />
              </div>
              <div class="part3-9">{{content0.type}} |</div> -->

              <div class="part3-10">
                <span style="font-size:12px ;">￥</span>
                <span style="font-size:20px ;">{{content1.price}}</span>
                <span style="font-size: 12px;">起/人</span>
              </div>
              <div class="part3-11">
                <div class="part3-11-1">详情</div>
              </div>
            </div>
          </div>
        </div>

        
        <!-- 第二页 -->
        <div class="it-panel">
          <div style="position:relative;width:100%;">
            <div class="part3-a">
              <div class="part3-3">
                {{content0.name}}
                <!-- 马来西亚·邦邦岛·白珍珠度假村 | 丰富水下生物 探秘水下沉船 -->
              </div>
              <div class="part3-4">
                <img src="@/assets/image/行程首页切图/Shape.png" style="width:100%;height:100%;">
              </div>
              <div class="part3-5">{{content0.address}}</div>
              <div class="part3-6"></div>
              <div class="part3-7">{{content0.description}}</div>
              <div class="part3-8">
                <img src="@/assets/image/行程首页切图/主题 copy.png"  style="width:100%;height:100%;">
              </div>
              <div class="part3-9">{{content0.type}} |</div>
              <div class="part3-10">
                <span style="font-size:12px ;">￥</span>
                <span style="font-size:20px ;">{{content0.price}}</span>
                <span style="font-size: 12px;">起/人</span>
              </div>
              <div class="part3-11">
                <div class="part3-11-1">详情</div>
              </div>
            </div>

            <div class="part4">
              <img :src="content0.pho"  style="width:100%;height:100%;">
            </div>
          </div>
          <div style="position:relative;width:100%;">
            <div class="part5">
              <img :src="content1.pho"  style="width:100%;height:100%;">
            </div>
            <div class="part3-a-1">
              <div class="part3-3">{{content1.name}}</div>
              <div class="part3-4">
                <img src="@/assets/image/行程首页切图/Shape.png" style="width:100%;height:100%;">
              </div>
              <div class="part3-5">{{content1.address}}</div>
              <div class="part3-6"></div>
              <div class="part3-7">{{content1.description}}</div>
              <div class="part3-8">
                <img src="@/assets/image/行程首页切图/主题 copy.png" style="width:100%;height:100%;">
              </div>
              <div class="part3-9">{{content1.type}} |</div>
              <div class="part3-10">
                <span style="font-size:12px ;">￥</span>
                <span style="font-size:20px ;">{{content1.price}}</span>
                <span style="font-size: 12px;">起/人</span>
              </div>
              <div class="part3-11">
                <div class="part3-11-1">详情</div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div style="position:relative;width:100%;">
      <div style="position:absolute;width:60px;left:0;right:0;margin:auto auto;">
        <div class="split-bot" :class="page===1?'short':'long'" @mouseenter.stop="page=0"></div>
        <div class="split-bot" :class="page===0?'short':'long'" @mouseenter.stop="page=1"></div>
      </div>
    </div>
  </div>
</template>

<style scoped>
.part3 {
  position: relative;
  width: 1440px;
  height: 765px;
  margin: 0 auto;
}

.part3-1 {
  width: 116px;
  height: 41px;
  font-size: 28px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(27, 27, 27, 1);
  line-height: 40px;
  margin-top: 74px;
  margin-left: 150px;
  position: relative;
  float: left;
}

.part3-2 {
  width: 1000px;
  height: 180px;
  margin-top: 0px;
  margin-left: 50px;
  position: relative;
  float: left;
}
.it-panel {
  position: relative;
  float: left;
}
.part3-a {
  width: 500px;
  height: 248px;
  margin-top: 39px;
  margin-left: 150px;
  position: relative;
  float: left;
}

.part3-a-1 {
  width: 500px;
  height: 248px;
  margin-top: 124px;
  margin-left: 80px;
  position: relative;
  float: left;
}

.part3-3 {
  width: 500px;
  height: 58px;

  position: relative;
  float: left;
  font-size: 22px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(27, 27, 27, 1);
  line-height: 29px;
  text-align: left;
}

.font3-3-1 {
  font-size: 22px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(27, 27, 27, 1);
  line-height: 29px;
  float: left;
}

.part3-4 {
  width: 8px;
  height: 12px;
  margin-top: 24px;
  margin-left: 4px;
  position: relative;
  float: left;
}

.part3-5 {
  width: 47px;
  height: 20px;
  margin-top: 20px;
  margin-left: 4px;
  position: relative;
  float: left;
  font-size: 14px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(99, 99, 99, 1);
  line-height: 20px;
}

.part3-6 {
  width: 400px;
  height: 20px;
  margin-top: 20px;
  margin-left: 4px;
  position: relative;
  float: left;
}

.part3-7 {
  margin-top: 30px;
  position: relative;
  float: left;
  width: 500px;
  height: 50px;
  font-size: 16px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(99, 99, 99, 1);
  line-height: 25px;
  text-align: left;
}

.part3-8 {
  position: relative;
  float: left;
  margin-top: 50px;

  width: 12.49px;
  height: 11.97px;
}

.part3-9 {
  position: relative;
  float: left;
  margin-top: 45px;
  margin-left: 5px;
  width: 70px;
  height: 20px;
  font-size: 14px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(144, 144, 144, 1);
  line-height: 20px;
}

.part3-10 {
  position: relative;
  float: left;
  margin-top: 48px;
  margin-left: 13px;
  width: 120px;
  height: 14px;
  font-size: 12px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(194, 119, 54, 1);
  line-height: 14px;
}

.part3-11 {
  position: absolute;
  margin-top: 218px;
  margin-left: 412px;
  width: 88px;
  height: 30px;
  width: 88px;
  height: 30px;
  background: rgba(194, 119, 54, 1);
  border-radius: 15px;
}

.part3-11-1 {
  margin-top: 5px;
  margin-left: 27px;
  width: 35px;
  height: 20px;
  font-size: 14px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(255, 255, 255, 1);
  line-height: 20px;
  letter-spacing: 2px;
}

.part4 {
  width: 560px;
  height: 315px;
  background: rgba(240, 240, 240, 1);
  margin-top: 5px;
  margin-left: 80px;
  float: left;
  position: relative;
  /* background-image: url(@/assets/image/行程首页切图/海边.png); */
}

.part5 {
  width: 560px;
  height: 315px;
  background: rgba(240, 240, 240, 1);
  margin-top: 93px;
  margin-left: 150px;
  float: left;
  position: relative;
  /* background-image: url(@/assets/image/行程首页切图/船舶.png); */
}

.split-bot {
  position: relative;
  float: left;
  margin-right: 5px;
  height: 8px;
  background: rgba(207, 207, 207, 1);
  border-radius: 4px;
  transition: width 0.2s;
}
.long {
  width: 40px;
}
.short {
  width: 8px;
}
</style>

<script>
export default {
  data() {
    return {
      page: 0
    };
  },
  computed: {
    content0() {
      if (this.contents != null && this.contents[0]) return this.contents[0];
      return [];
    },
    content1() {
      if (this.contents != null && this.contents[1]) return this.contents[1];
      return [];
    },
    splitePanelStyle() {
      return {
        transform: `translateX(${this.page == 0 ? 0 : -1290}px)`
      };
    }
  },
  props: ["contents"]
};
</script>
