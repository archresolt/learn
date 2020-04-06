<template>
  <div class="main">
    <div class="left">
      <div class="img">
        <img :src="img" style="width:100%;height:100%;" />
      </div>
    </div>
    <div class="right">
      <div class="name">{{title}}</div>
      <div class="description">{{desp}}</div>

      <!-- 右侧下方信息栏 -->
      <div class="info">
        <!-- 標簽 -->
        <div class="tags">
          <div class="logo">
            <i class="el-icon-price-tag" style="font-size:10px;"></i>
          </div>
          <div class="industryNews">{{tagName}}</div>
        </div>
        <!-- 浏览和时间 -->
        <div class="infoRight">
          <div class="rightBottom">
            <div class="browseNumber">浏览 {{browserCount}}</div>
            <div class="date">{{date}}</div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>
<script>
export default {
  props: {
    tags: {},
    title: {
      default() {
        return "测试名称";
      }
    },
    desp: {
      default() {
        return "測試描述";
      }
    },
    img: {
      default() {
        return "/static/img/community/part1.png";
      }
    },
    browserCount: {
      default() {
        return 123;
      }
    },
    date: {
      default() {
        return "2020/03/14";
      }
    }
  },
  computed: {
    tagName() {
      return this.tags && this.tags.join(" , ");
    }
  },
  data() {
    return {};
  }
};
</script>
<style scoped>
.main {
  width: 100%;
  height: 130px;
  position: relative;
  margin-bottom: 40px;
  text-align: left;
  padding:30px;
}

.main:hover {
  box-shadow: 0px 2px 20px 0px rgba(212, 212, 212, 0.5);
}

.article {
  width: 100%;
  height: 150px;
  position: relative;
}
.left {
  width: 220px;
  height: 100%;
  position: relative;
  float: left;
}
.img {
  width: 100%;
  height: 100%;
  position: relative;
}
.right {
  width: 70%;
  height: 100%;
  position: relative;
  margin-left: 30px;
  float: left;
}
.name {
  position: relative;
  font-size: 20px;
  font-family: PingFangSC-Medium, PingFang SC;
  font-weight: 500;
  color: rgba(27, 27, 27, 1);
  line-height: 28px;
}
.description {
  position: relative;
  margin-top: 10px;
  font-size: 14px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(99, 99, 99, 1);
  line-height: 22px;
}
.industryNews {
  position: relative;
  float: left;
  margin-left:5px;
  font-size: 14px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(98, 151, 185, 1);
}
.logo {
  width: 10px;
  height: 16px;
  position: relative;
  float: left;
}
.industryNews-text {
  width: 102px;
  height: 16px;
  font-size: 14px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(98, 151, 185, 1);
  line-height: 16px;
  position: relative;
  float: left;
  background: violet;
}
.rightBottom {
}
.tags {
  width: 50%;
  position: relative;
  float: left;
}
.infoRight {
  position: relative;
  float: right;
}
.info {
  position: absolute;
  bottom: 0;
  width: 100%;
  height: 20px;
}
.browseNumber {
  font-size: 12px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(144, 144, 144, 1);
  float: left;
  margin-right: 10px;
}
.date {
  float: left;
  font-size: 12px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(179, 179, 179, 1);
  margin-right: 20px;
}
</style>