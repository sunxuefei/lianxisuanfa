raft算法算得上是一种共识算法，主要的作用是让集群内的共识达成一致。比如说在集群a中充值了100块钱，那么就是在
集群内的任何一台机器上查询都是100.
raft里面的重要概念：term：任期。logIndex：旗舰令。这个旗舰令只会不断的递增。

选举过程：
何时发生选举：一种情况是当所有的follower联系不上leader的时候，会发起选举请求。
何时真正发起选举：只有超过一半的follower同意leader的选举，才会选出leader。否则则会重新进行选举。其中
会遇到一种情况，就是多个follower同时进行选举，导致每一个follower都没有超过半数，则选举无效。vote split
避免这种情况的发生可以使用随机的选举触发事件。当发现没有leader之后，会随机的等待一段时间，如果这段时间
没有选举出leader，则follower进行选举。


raft的两个属性：term、logindex。对于相互之间的投票会对比这两个值，对于任期看看哪一个任期是最新的。
对于旗舰令看看哪个旗舰令是最全的。

利用这两个属性去选举会导致一个问题，raft的协议里面有一个捣乱机制，就是一个与其他节点都不能通信的节点，
那么它就会自以为是的每次提升自己的term，在jraft算法中会导致leader退下来。

解决这个问题就是需要一个预投票环节，就是需要超过半数的连通性才能发起参选，这样就不会有捣乱节点提升term了。


raft算法中的日志复制：