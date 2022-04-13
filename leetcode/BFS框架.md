# BFS框架
### BFS和DFS
**DFS其实就是回溯算法**  

**BFS 相对 DFS 的最主要的区别是**：BFS 找到的路径一定是最短的，但代价就是空间复杂度可能比 DFS 大很多  

**BFS通常用队列数据结构实现**  

**BFS的常见情景：** 在一幅图中找到从起点到终点的最近距离,比如走迷宫的最短距离  

```

声明并初始化队列
声明并初始化访问list
声明并初始化记录的步数

将初始点加入队列
将初始点加入访问list

while(队列不为空){
   获取队列的大小
   for(队列的大小){
     poll出去一个节点
     if poll出去的节点是target
        return step
     把这个节点的附近节点全部加入队列   
   }
   step++
}

```
### 二叉树的最小高度
```java

public int minDepth(TreeNode root) {
        //声明并初始化所有变量
        Queue<TreeNode> p = new LinkedList<TreeNode>();
          //注意特殊情况
          if(root==null) return 0;
          //本身root所在的深度就为1
        int step = 1;
        p.offer(root);
        while(!p.isEmpty()){
          int size = p.size();
          for(int i =0;i<size;i++){
              TreeNode m = p.poll();
              if(m.left==null&&m.right==null){
                  return step;
              }
              //注意判断条件 因为可能为空
              if(m.left!=null){
              p.offer(m.left);}
              if(m.right!=null){
              p.offer(m.right);}
          }
        step++;
        }
        //注意还要return
        return step;
}
```
> 1. 注意考虑特殊情况 
> 2. 树的root本身深度就是1
> 3. 注意树的判断条件 可能有一个子节点
> 4. 记住最后也要return step 因为可能没有taget值
> 5. step++ 所在的位置：判断是不是target是在出队列的时候,假如某层node成功全部出去queue就step++，所以是在整个for循环后面。
