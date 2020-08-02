package com.example.layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
/*
* 一个界面就是一个Activity
* 一个界面上显示的内容，称为View
* ViewGroup 可以存放多个View，并且管理View的布局
* 根据布局的不同有很多划分
* FrameLayout 帧布局
* LinearLayout 线性布局
* RelativeLayout 相对布局
* ConstrainLayout 约束布局
* */

/*
一、FrameLayout
1.每个容器都有自己的LayoutParams类
2.管理子控件的布局参数xml中引用某个资源 使用@
3.layout的width和height 可以自己设置
（1）固定值
（2）matchparent匹配父容器
（3）wrapcontent自适应内容
4.当添加子控件时，最后添加的控件在外层，如果控件较大，可能会覆盖原来的内容
5.layout_margin设置View和父容器的间距，layout_marginStart，layout_marginLeft...
6.padding View里面的内容和这个View之间的间距
7.通过layout_gravity设置View的重心，即位置
8.总结
FrameLayout功能很少，所以使用得也较少
 */

/*
二、LinearLayout
只有横向和纵向的布局 可以使用LinearLayout
1.使用LinearLayout必须先确定屏幕的方向，是vertical还是horizontal，使用orientation，默认horizontal
2.layout_gravity设置当前View和父容器的关系，gravity设置自己的子控件和自己的关系
3.layout_weight权重，就是给View设置一个占比，使用weight需要先把高度或宽度设为0dp
4.LinearLayout嵌套不要太多，如果太多的话代码会很臃肿
 */

/*
三、RelativeLayout
子控件和子控件，子控件和父控件之间可以添加许多对应关系
 */

/*
四、ConstraintLayout
从代码转变为拖拽的方式，提高效率
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}


