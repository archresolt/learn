<template>
  <div>
    <!-- 顶部的块 -->
    <div class="top">
      <!-- 顶部图片 -->
      <div class="topPho">
        <lunBo :topImgs="topPhos"></lunBo>
      </div>
      <!-- 图片右边的详情 -->
      <div class="courseDes">
        <div class="mingshi">
          <span style="color:#6297B9;font-size:16px">名师 |</span>
          PADI初级开放水域潜水员课程(OW)
        </div>

        <!-- 中间那块有背景的稍微复杂的快 -->
        <div class="desMiddle">
          <div class="middleF">课程编号 2897123</div>
          <div class="middleS">开放水域 | 度假胜地 | 初级</div>
          <div class="middleT">几乎任何人都可以尝试水肺潜水，水肺潜水是一项有趣的水下运动和活动。</div>
        </div>
        <!-- 下面的价格，二维码 -->
        <div style="height:105px">
          <div class="erWeiMa" v-if="current==1">
            <img src="static\img\03.28补图\360截图20200331161713052.jpg" style="width:100%;height:100%" />
          </div>
          <div class="topPrice">
            <span style="font-size:14px">￥</span>
            1299
            <span style="font-size:14px">.50</span>
          </div>
          <div class="buyQuickly" @mouseenter="look(1)" @mouseleave="look(0)">
            <div class="buyText">立即购买</div>
            <div class="erWei">
              <img src="static\img\findGreat\Bitmap.png" style="width:100%;height:100%" />
            </div>
          </div>
        </div>
      </div>
      <div class="topText">
        *此商品仅限大陆，港澳台地区购买，如有疑问，请您
        <span style="color:#6297B9">联系客服</span>，同时也可以
        <span style="color:#6297B9">下载app</span>去购买
      </div>
    </div>

    <!-- 底部 -->
    <div class="bottom">
      <div class="bottomMask"></div>
      <div class="box">
        <img src="static/img/关于我们/“.png" style="width:100%;height:100%" />
      </div>
      <!-- 三张图的部分 -->
      <div style="padding-top:80px">
        <div class="threePho">
          <div class="oneBottomPho" v-for="(item,index) in bottomPhos" :key="index">
            <!-- 下部的第一张图 -->
            <div class="bottomPho">
              <img :src="item.pho" style="width:100%;height:100%" />
            </div>
            <!-- 文字部分 -->

            <div class="bottomMingShi">
              <span style="color:#6297B9;font-size:16px">{{item.mingshi}}</span>
              {{item.des}}
            </div>

            <div class="chuJi">{{item.chuJi}}</div>
            <div class="yellowText">
              <span style="font-size:12px">￥</span>
              {{item.price}}
              <span style="font-size:12px">.50</span>
            </div>
          </div>
          <!-- <div></div> -->
        </div>
      </div>
    </div>

    <!-- 页脚 -->
    <pagefooter style="margin-top:132px"></pagefooter>
  </div>
  <!-- </div> -->
</template>
<script>
import pagefooter from "../pagebottom/pagefooter";
import lunBo from "../findgreat/carousel";
export default {
  components: {
    lunBo: lunBo,
      pagefooter:pagefooter,
  },
  methods: {
    look(num) {
      this.current = num;
      // console.log("aaaaa");
    }
  },
  data() {
    return {
      current: 0,
      topPhos: [
        {
          img: "static/img/findCourses/cnHhjE9PkqCDL-PMAAF-8gj3PbQ41.jpeg"
        },
        {
          img: "static/img/findCourses/1.jpeg"
        },
        {
          img: "static/img/findCourses/wKgBZ1mRHd2AFs9-AAEBxd1UGrM34.jpeg"
        }
      ],
      bottomPhos: [
        {
          mingshi: "名师 |",
          des: "SSI初级开放水域潜水课程",
          pho: "static/img/findCourses/1.jpeg",
          chuJi: "开放水域 | 度假胜地 | 初级",
          price: "1299"
        },
        {
          // mingshi:"名师 |",
          des: "PADI初级开放水域系列潜水员课程(OW)",
          pho:
            "static/img/findCourses/e9583037c57c1434b012ac239c3dc7d3a3ba1156dd07-br8m65_fw658.jpg",
          chuJi: "开放水域 | 度假胜地 | 初级",
          price: "1299"
        },

        {
          // mingshi:"名师",
          des: "PADI初级开放水域系列潜水员课程潜水员课程(OW)",
          pho: "static/img/findCourses/350b0a0000004jdrb9FE9_Z_1000_0.jpg",
          chuJi: "开放水域 | 度假胜地 | 初级",
          price: "1299"
        }
      ]
    };
  }
};
</script>
<style scoped>
.top {
  width: 1440px;
  height: 725px;
  margin: 0 auto;
}
.topPho {
  width: 734px;
  height: 510px;
  position: absolute;
  margin-top: 40px;
  margin-left: 150px;
  background: blue;
}
.courseDes {
  position: absolute;
  margin-top: 102px;
  margin-left: 810px;
  width: 630px;
  height: 386px;
  background: rgba(255, 255, 255, 1);
  border-radius: 10px;
  /* 设置谁在最上面一层的方法 */
  z-index: 2000;
}
.mingshi {
  width: 422px;
  height: 58px;
  margin-top: 35px;
  margin-left: 45px;
  font-size: 22px;
  font-family: PingFangSC-Medium, PingFang SC;
  font-weight: 500;
  color: rgba(27, 27, 27, 1);
  line-height: 30px;
  text-align: left;

  /* background:lightblue; */

  /* text-align: center; */
}
.desMiddle {
  margin-top: 20px;
  margin-left: 25px;
  width: 468px;
  height: 168px;
  background: rgba(248, 249, 250, 1);
  border-radius: 5px;
}
.middleF {
  margin-left: 20px;
  margin-top: 10px;
  width: 105px;
  height: 22px;
  font-size: 12px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(179, 179, 179, 1);
  line-height: 22px;
}
.middleS {
  margin-left: 20px;
  margin-top: 10px;
  width: 148px;
  height: 16px;
  font-size: 12px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(144, 144, 144, 1);
  line-height: 16px;
}
.middleT {
  margin-left: 20px;
  margin-top: 10px;
  width: 428px;
  height: 58px;
  font-size: 14px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(27, 27, 27, 1);
  line-height: 24px;
  text-align: left;
}
.topPrice {
  float: left;
  width: 128px;
  height: 40px;
  margin-left: 45px;
  margin-top: 35px;
  font-size: 28px;
  font-family: PingFangSC-Medium, PingFang SC;
  font-weight: 500;
  letter-spacing: 0;
  color: rgba(194, 119, 54, 1);
  line-height: 20px;
  text-align: left;
}
.buyQuickly {
  float: left;
  margin-left: 76px;
  margin-top: 30px;
  width: 176px;
  height: 50px;
  background: rgba(194, 119, 54, 1);
  border-radius: 25px;
}
.buyText {
  float: left;
  margin-left: 38px;
  margin-top: 14px;
  width: 76px;
  height: 22px;
  font-size: 16px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(255, 255, 255, 1);
  line-height: 22px;
  letter-spacing: 2px;
}
.erWei {
  float: left;
  margin-left: 14px;
  margin-top: 15px;
  width: 20px;
  height: 20px;
  background: rgba(255, 255, 255, 1);
}
.erWeiMa {
  width: 145px;
  height: 153px;
  position: absolute;
  margin-top: -145px;
  margin-left: 258px;
  background: rgba(255, 255, 255, 1);
  box-shadow: 0px 2px 10px 0px rgba(198, 198, 198, 0.5);
  /* border:2px solid rgba(194,119,54,1); */
}
.topText {
  position: absolute;
  margin-top: 512px;
  margin-left: 924px;
  width: 366px;
  height: 40px;
  font-size: 12px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(144, 144, 144, 1);
  line-height: 18px;
  text-align: left;
}
.bottom {
  width: 1440px;
  height: 530px;
  /* background: rgba(224, 234, 241, 1); */
  /* opacity: 0.5; */
  margin: 0 auto;
}
.bottomMask {
  position: absolute;
  width: 1440px;
  height: 530px;
  background: rgba(224, 234, 241, 1);
  opacity: 0.3;
  /* left: 150px; */
  /* right: 0; */
  top: 821px;
  /* bottom: 0; */
}
.box {
  width: 48px;
  height: 42px;
  /* background: rgba(194, 119, 54, 1); */
  position: absolute;
  margin-left: 696px;
  margin-top: -21px;
}
.threePho {
  width: 1203px;
  height: 342px;
  margin: 0 auto;
  /* margin-top: 80px; */
}
.oneBottomPho {
  width: 366px;
  height: 342px;
  margin-left: 21px;
  float: left;
}
.bottomPho {
  width: 366px;
  height: 230px;
}
.bottomMingShi {
  width: 365px;

  font-size: 18px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: #1b1b1b;
  line-height: 30px;
  margin-top: 12px;
  text-align: left;
}
.chuJi {
  margin-top: 16px;
  width: 148px;
  height: 16px;
  font-size: 12px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(144, 144, 144, 1);
  line-height: 16px;
}
.yellowText {
  margin-top: 16px;
  width: 119px;
  height: 20px;
  font-size: 20px;
  font-family: PingFangSC-Medium, PingFang SC;
  font-weight: 500;
  color: rgba(194, 119, 54, 1);
  line-height: 17px;
  letter-spacing: 1px;
  text-align: left;
}
</style>