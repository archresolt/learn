<template>
  <el-checkbox-group v-model="checkList">
    <el-checkbox label="复选框A"></el-checkbox>
    <el-checkbox label="复选框B"></el-checkbox>
    <el-checkbox label="复选框 C"></el-checkbox>
    <el-checkbox label="禁用" disabled></el-checkbox>
    <el-checkbox label="选中且禁用" disabled></el-checkbox>
  </el-checkbox-group>
</template>
<script>
export default {
    data(){
        return{
            //为什么这里选中被禁用 结果真的被勾选√了
    checkList:["选中且被禁用","复选框A"]
        };
    }
};
</script>