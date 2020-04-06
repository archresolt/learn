<template>
  <div>
    <div class="header">
      <div class="header-content">
        <div class="content-article" v-for="(item,index) in articleTop3" :key="index">
          <img :src="item.img" />
          <div class="article-title">{{item.title}}</div>
        </div>
      </div>
    </div>
    <div class="content">
      <div class="left-side">
        <div class="title-bar">
          <div class="title-onebyone" v-for="(item,index) in leftTitleBar" :key="index">{{item.title}}</div>
        </div>
        <!-- 文章区域 -->
        <div class="left-article-top5">
          <article1
            v-for="(art,index) in mainArticles"
            :key="index"
            :title="art.title"
            :desp="art.desp"
            :date="art.date"
            :browseCount="art.browseCount"
            :img="art.img"
            :tags="art.tags"
          ></article1>
        </div>
      </div>
      <!-- 右侧热榜 -->
      <div class="right-side">
        <div class="right-side-title">
          <div class="hot-list">热榜</div>
        </div>
        <div class="right-article-top2" v-for="(item,index) in  rightArticleTop" :key="index">
          <div class="right-img-line">
            <div class="article-top2-img"></div>
            <div class="article-top2-text"></div>
          </div>
          <div class="article-top2-line"></div>
        </div>
        <!-- 右下六篇文章 -->
        <div class="right-article-bottom6" v-for="(item,index) in   rightArticleBottom" :key="index">
          <div class="right-article-bottomLogo"> 
            <img :src = "item.img">
          </div>
          <div class="right-article-onebyone"></div>
        </div>
      </div>
    </div>
  </div>
</template>
<script>
import article from "./article.vue";
export default {
  components: { article1: article },
  data() {
    return {
      articleTop3: [
        {
          title: "极为后来还自发",
          img: "/static/img/community/part1.png",
          path: ""
        },
        {
          title: "极为后来还自发",
          img: "/static/img/community/part1.png",
          path: ""
        },
        {
          title: "极为后来还自发",
          img: "/static/img/community/part1.png",
          path: ""
        }
      ],
      leftTitleBar: [
        {
          title: "潜点资讯"
        },
        {
          title: "行程攻略"
        },
        {
          title: "潜水装备"
        },
        {
          title: "水摄"
        },
        {
          title: "技术潜水"
        }
      ],
      leftArticle: [
        {
          img: "",
          title: "",
          description: ""
        }
      ],
      rightArticleTop: [
        {
          img: "/static/img/community/part1.png",
          title: "世界上唯一能克服焦虑症的地方,我想一辈子呆在哪",
          path: ""
        },
        {
          img: "/static/img/community/part1.png",
          title: "世界上唯一能克服焦虑症的地方,我想一辈子呆在哪",
          path: ""
        }
      ],
      mainArticles: [
        {
          title: "在他的故事里，潜水是第三者，海豚和大海才是真爱!",
          img: "/static/img/community/part3.png",
          desp: "人人都会有紧张、焦虑或压力时候，一般的做法是选择自行消化，找朋友倾诉…",
          browserCount: 123,
          date: "2010/01/12",
          path: "",
          tags:["装备","业内新闻"],
        },
        {
          title: "你感受不到深海恐惧，也许是克服了人类天生的本能",
          img: "/static/img/community/part2.png",
          desp: "故事的主人翁——雅克·梅荷（Jacques Mayol），1927年4月1日出生在上海。",
          browserCount: 123,
          date: "2010/01/12",
          path: "",
           tags:["装备","业内新闻"],
        },
        {
          title: "这是我找到的现阶段最适合生活方式",
          img: "/static/img/community/part1.png",
          desp: "我总是惊讶地发现，我不假思索地上路，因为出发的感觉太好了。",
          browserCount: 123,
          date: "2010/01/12",
           tags:["装备","业内新闻"],
          path: ""
        },
        {
          title: "在他的故事里，潜水是第三者，海豚和大海才是真爱!",
          img: "/static/img/community/part1.png",
          desp: "故事的主人翁——雅克·梅荷（Jacques Mayol），1927年4月1日出生在上海…",
          browserCount: 123,
          date: "2010/01/12",
           tags:["装备","业内新闻"],
          path: ""
        },
        {
          title: "你感受不到深海恐惧，也许是克服了人类天生的本能",
          img: "/static/img/community/part2.png",
          desp: "人人都会有紧张、焦虑或压力时候，一般的做法是选择自行消化，找朋友倾诉…",
          browserCount: 123,
          date: "2010/01/12",
           tags:["装备","业内新闻"],
          path: ""
        },
        // {
        //   title: "F",
        //   img: "/static/img/community/part3.png",
        //   desp: "afadsfadsfasfasf",
        //   browserCount: 123,
        //   date: "2010/01/12",
        //    tags:["装备","业内新闻"],
        //   path: ""
        // }
      ],
      rightArticleBottom:[
        {
          img:"/static/img/community/copy3.png",
          title:"",
        },
          {
          img:"/static/img/社区首页1/“ copy 3.png",
          title:"",
        },
          {
          img:"/static/img/社区首页1/“ copy 3.png",
          title:"",
        },
          {
          img:"/static/img/社区首页1/“ copy 3.png",
          title:"",
        },
          {
          img:"/static/img/社区首页1/“ copy 3.png",
          title:"",
        },
          {
          img:"/static/img/社区首页1/“ copy 3.png",
          title:"",
        },
          {
          img:"/static/img/社区首页1/“ copy 3.png",
          title:"",
        },
      ]
    };
  }
};
</script>
<style scoped>
.header {
  width: 100%;
  height: 348px;
  /* background: blue; */
  position: relative;
}
.header-content {
  position: relative;
  left: 0;
  right: 0;
  top: 0;
  bottom: 0;
  margin: auto;
  width: 1200px;
  height: 228px;
  display: flex;
  /* 这里设置间隔 */
  justify-content: space-between;
  /* background: salmon; */
}
.content {
  position: relative;
  width: 1200px;
  margin: 0 auto;
  position: absolute;
  left: 0;
  right: 0;
}
.content-article {
  position: relative;
  width: 360px;
  height: 100%;
  /* background: seagreen; */
  float: left;
}
.article-title {
  position: absolute;
  width: 301px;
  height: 25px;
  font-size: 16px;
  font-family: PingFangSC-Medium, PingFang SC;
  font-weight: 500;
  color: rgba(255, 255, 255, 1);
  line-height: 22px;
  margin-top: -30px;
  margin-left: -75px;
}
.left-side {
  width: 70%;
  height: auto;
  position: relative;
  float: left;
}
.title-bar {
  width: 100%;
  height: 85px;
  position: relative;
}
.title-onebyone {
  height: 25px;
  margin-right: 65px;

  font-size: 18px;
  font-family: PingFangSC-Medium, PingFang SC;
  font-weight: 500;
  color: rgba(99, 99, 99, 1);
  line-height: 25px;
  position: relative;
  float: left;
}
.title-onebyone:hover{
    font-weight: bold;
}
.left-article-top5 {
  width: 100%;
  height: auto;
  position: relative;
}
.left-article-onebyone {
  width: 100%;
  height: 15%;
  position: relative;
  background: rgba(98, 151, 185, 1);
  margin-top: 3%;
}
.left-article-onebyone-img {
  width: 50%;
  height: 100%;
  position: relative;
}
.left-article-onebyone-title {
  width: 50%;
  height: 30%;
  position: relative;
}
.left-article-onebyone-description {
  width: 50%;
  height: 20%;
  position: relative;
  /* width:516px;
height:25px; */
  font-size: 14px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(99, 99, 99, 1);
  line-height: 22px;
}
.left-article-onebyone-leftbottom {
  width: 20%;
  height: 20%;
  position: relative;
}
.right-side {
  width: 288px;
  height: 754px;
  background: red;
  position: relative;
  float: right;
}
.right-side-title {
  position: relative;
  width: 100%;
  height: 30px;
  background: seagreen;
}
.hot-list {
  position: absolute;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  margin: auto;
  width: 34px;
  height: 22px;
  font-size: 16px;
  font-family: PingFangSC-Medium, PingFang SC;
  font-weight: 500;
  color: rgba(27, 27, 27, 1);
  line-height: 22px;
}
.right-article-top2 {
  position: relative;
  width: 100%;
  height: 120px;
  background: skyblue;
  padding-top: 15px;
}
.right-img-line {
  position: relative;
  width: 250px;
  height: 48px;
  margin: 0 auto;
}
.article-top2-img {
  position: relative;
  width: 68px;
  height: 48px;
  float: left;
  background: steelblue;
}
.article-top2-text {
  position: relative;
  float: left;

  width: 174px;
  height: 48px;
  font-size: 14px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(98, 151, 185, 1);
  line-height: 22px;
  background: tomato;
}
.article-top2-line {
  position: relative;

  width: 70%;
  height: 3px;
  margin: 50px auto;
  background: violet;
}
.right-article-bottom6 {
  width: 288px;
  height: 39px;
  margin-top:20px;
  margin-bottom:20px;
  position: relative;
  background: peru;
}
.right-article-bottomLogo {
  width: 10%;
  height: 20px;
  position: relative;
  float: left;
  background: palevioletred;
}
.right-article-onebyone {
  width: 90%;
  height: 39px;
  position: relative;
  float: left;
  background: yellow;
}
</style>
