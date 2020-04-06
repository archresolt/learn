<template>
<div class="mask">
    <i @click="$root.$emit('login',false)" class="el-icon-circle-close" style="position:absolute;right:20%;top:14%;font-size:25px;color:white;"></i>
    <div  :class="state=='login'?'positionLogin':'positionRegist'">
        <el-row>
            <el-col :span="3" :offset="3">
                <div class="zhuce" @click="state='regist'">
                    注册
                </div>
            </el-col>
            <el-col  :span="3" :offset="9">
                <div class="zhuce" @click="state='login'">
                    登录
                </div>
            </el-col>
        </el-row>
       
    </div>
 <div :class="state=='login'?'miMaBoxLogin':'miMaBoxRegist'">
<div class="yanZhengMa">

</div>

<div class="miMa">
    
</div>

        </div>
    <!-- <div class="miMaBox">

        </div> -->
</div>
</template>

<script>
export default {
    data() {
        return {
            state:'login',
        }
    }

}
</script>

<style scoped>
.zhuce {
    width: 100px;
    height: 40px;
    border-radius: 22px;
    border: 1px solid rgba(255, 255, 255, 1);
    margin-top: 295px;
    font-size: 16px;
    font-family: PingFangSC-Regular, PingFang SC;
    font-weight: 400;
    color: rgba(255, 255, 255, 1);
    line-height: 40px;
}

.mask {
    position: fixed;
    width: 100%;
    height: 100%;
    background: rgba(100, 100, 100, .4);
    /* top:0;
left: 0; */
    margin: 0 auto;
}

.positionLogin {
    width: 876px;
    height: 438px;
    position: fixed;
    top: 20%;
    background: fuchsia;
    left: 20%;
    transition: left 0.2s linear;
}
.positionRegist{
       width: 876px;
    height: 438px;
    position: fixed;
    top: 20%;
    background: fuchsia;
    left: 25%;
     transition: left 0.2s linear;
}
.miMaBoxLogin{
    position: fixed;
    width: 564px;
    height: 514px;
    background: rgba(255, 255, 255, 1);
    box-shadow: 0px 2px 20px 0px rgba(107, 107, 107, 0.5);
    border-radius: 10px;
    left: 43%;
    top:15%;
     transition: left 0.2s linear;
}
.miMaBoxRegist{
        position: fixed;
    width: 564px;
    height: 514px;
    background: rgba(255, 255, 255, 1);
    box-shadow: 0px 2px 20px 0px rgba(107, 107, 107, 0.5);
    border-radius: 10px;
    left: 17%;
    top:15%;
     transition: left 0.2s linear;
}
</style>
