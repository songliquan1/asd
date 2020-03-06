<template>
  <div  style="margin-left: 50px;padding-left: 30px;">
    <router-view></router-view>
      <div style="width: 80%;margin: auto;">
        <router-link to="/Update">更新</router-link>
        <router-link to="/Intesrt">添加</router-link>
        <br/><br/><br/>

        <table class="table table-hover text-center ">
          <thead>
            <tr>
              <td>编号</td>
              <td>名字</td>
              <td>年龄</td>
              <td>性别</td>
              <td>日期</td>
              <td>数据维护</td>

            </tr>

          </thead>

          <tbody>
            <tr v-for="a in areas">
              <td>{{a.sid}}</td>
              <td>{{a.name}}</td>
              <td>{{a.age}}</td>
              <td>{{a.gender}}</td>
              <td>{{a.birth}}</td>
              <td>
                <button class="btn btn-danger" @click="delete1(a.sid,pagenum)">删除</button>
              </td>
            </tr>
          </tbody>


        </table>

        <div class="text-right">

          <button class="btn btn-default" @click="getAreas(1)">首页</button>
          <button class="btn btn-default" @click="getAreas( (pagenum-1<1)?1:(pagenum-1) )">上一页</button>

          <button v-for="pn in pagecount" class="btn" :class="{'btn-primary':pn==pagenum,'btn-link':pn!=pagenum}" @click="getAreas(pn)">{{pn}}</button>

          <button class="btn btn-default" @click="getAreas((pagenum+1>pagecount)?pagenum:(pagenum+1))">下一页</button>
          <button class="btn btn-default" @click="getAreas(pagecount)">尾页</button>

        </div>
      </div>
    </div>



  </template>

  <script>

    export default {

      data: function() {
        return {
          txt1: "ok",
          areas: [],
          pagecount: 0,
          pagenum: 1
        };
      },
      mounted: function() {
        this.getAreas(this.pagenum);
      },
      methods: {
        delete1:function (sid,pagenum) {
          if (!window.confirm("你确定要删除吗？")) {
              return;
          };
          var url = "http://127.0.0.1:8081/ssm190820/areainfocontrollerajax/dodelete"
          $.ajax(url, {
            data:{
              sid:sid,
              pagenum:pagenum
            },

          });
          this.getAreas(this.pagenum)
        },

        getAreas: function(pn) {
          var ob = this;
          ob.pagenum = pn;

          var url = "http://127.0.0.1:8081/ssm190820/areainfocontrollerajax/getall"
          $.ajax(url, {

            data: {
              "pagenum": ob.pagenum
            },

            success: function(result) {

              ob.areas = result.list;
              ob.pagecount = result.pageCount;

            }
          });
        }
      }




    }
  </script>


<style>

</style>
