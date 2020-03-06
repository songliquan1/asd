<template>
  <div>
    <br /><br />
    名字：&nbsp; <input  type="text" class="form-control-static" v-model="name">
    <br /><br />
    年龄：&nbsp;<input  type="text" class="form-control-static" v-model="age">
    <br /><br />
    性别：&nbsp;<input  type="text" class="form-control-static" v-model="gender">
    <br /><br />
    日期：&nbsp;<input  type="text" class="form-control-static" v-model="birth">
    <br /><br />
    <button class="btn btn-danger" @click="dointesrt()" >添加</button>
  </div>
</template>

<script>
  export default {
      data(){
        return{
          name:"",
          gender:"",
          age:"",
          birth:"",
        };

      },

      methods:{

        dointesrt(){

          var ob=this;
          var url = "http://127.0.0.1:8081/ssm190820/areainfocontrollerajax/doinsert"
          $.ajax(url, {
            data:{
              "name":ob.name,
              "age":ob.age,
              "gender":ob.gender,
              "birth":ob.birth,
              },
            success: function(result) {
              if(result){
                ob.$router.push({
                  path:"/"
                });
              }
            }
          });

        },

      },

  }
</script>

<style>
</style>
