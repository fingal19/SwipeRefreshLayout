##SwipeRefreshLayout
####一个很简单的下拉刷新

SwipeRefreshLayout：SwipeRefreshLayout组件只接受一个子组件：
即需要刷新的那个组件。它使用一个侦听机制来通知拥有该组件的监听器有刷新事件发生
，换句话说我们的Activity必须实现通知的接口。该Activity负责处理事件刷新和刷新相应的视图。
一旦监听者接收到该事件，就决定了刷新过程中应处理的地方。
如果要展示一个“刷新动画”，它必须调用setRefrshing（true），否则取消动画就调用setRefreshing（false）。

**<br>
在Layout中，让SwipeRefrshLayout包裹一个科滑动的View（像ListView，RecyclerView等等）下拉即可实现刷新，
但是如果代码中不设置setRefrshing属性，刷新动作会一直执行。直到代码执行setRefrshing为false。

![密钥主页面](https://github.com/fingal19/SwipeRefreshLayout/blob/master/app/src/main/res/drawable/SwipeRefreshLayout.png)
