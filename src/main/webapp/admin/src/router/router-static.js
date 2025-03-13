import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import shebeishenqing from '@/views/modules/shebeishenqing/list'
    import zichanbaobiao from '@/views/modules/zichanbaobiao/list'
    import yonghu from '@/views/modules/yonghu/list'
    import zichanshebei from '@/views/modules/zichanshebei/list'
    import zichanruku from '@/views/modules/zichanruku/list'
    import wupinleixing from '@/views/modules/wupinleixing/list'
    import liaotianhuifu from '@/views/modules/liaotianhuifu/list'
    import xiaohuixinxi from '@/views/modules/xiaohuixinxi/list'
    import liaotianxinxi from '@/views/modules/liaotianxinxi/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/shebeishenqing',
        name: '设备申请',
        component: shebeishenqing
      }
          ,{
	path: '/zichanbaobiao',
        name: '资产报表',
        component: zichanbaobiao
      }
          ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
          ,{
	path: '/zichanshebei',
        name: '资产设备',
        component: zichanshebei
      }
          ,{
	path: '/zichanruku',
        name: '资产入库',
        component: zichanruku
      }
          ,{
	path: '/wupinleixing',
        name: '物品类型',
        component: wupinleixing
      }
          ,{
	path: '/liaotianhuifu',
        name: '聊天回复',
        component: liaotianhuifu
      }
          ,{
	path: '/xiaohuixinxi',
        name: '销毁信息',
        component: xiaohuixinxi
      }
          ,{
	path: '/liaotianxinxi',
        name: '聊天信息',
        component: liaotianxinxi
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
