1.查看java进程
ps -ef | grep java 或者jps

2.查看该进程下线程占用资源
top -p  进程id -H

3.打印java进程28174的堆栈信息
jstack 28174 >> stack.log

4.将cpu的消耗高的线程的pid切换为16进制
printf 0x%x 线程id 
比如0x7fb6

5.从刚才的栈日志中查找该进程正在运行的方法
grep 0x7fb6 stack.log -a3

"MSXMLProcessorThread" prio=10 tid=0x00002b469923a800 [color=darkred]nid=0x7fb6[/color] sleeping[0x00002b46b0200000]    
   java.lang.Thread.State: TIMED_WAITING (sleeping)    
        at java.lang.Thread.sleep(Native Method)    
        at com.adventnet.management.xml.MSXmlProcessor.listen(MSXmlProcessor.java:279)    
        at com.adventnet.management.xml.MSXmlProcessor.run(MSXmlProcessor.java:264)    
        at java.lang.Thread.run(Thread.java:619)  
        
6.也可以查看正在运行的线程，以及线程运行的状态
grep RUNNABLE stack.log -a1

7.查看当前jvm内存各堆区的占比
jmap -heap 8001

Heap Configuration:
   MinHeapFreeRatio         = 40
   MaxHeapFreeRatio         = 70
   MaxHeapSize              = 2147483648 (2048.0MB)
   NewSize                  = 786432000 (750.0MB)
   MaxNewSize               = 786432000 (750.0MB)
   OldSize                  = 1361051648 (1298.0MB)
   NewRatio                 = 2
   SurvivorRatio            = 8
   MetaspaceSize            = 39845888 (38.0MB)
   CompressedClassSpaceSize = 1073741824 (1024.0MB)
   MaxMetaspaceSize         = 398458880 (380.0MB)
   G1HeapRegionSize         = 0 (0.0MB)

Heap Usage:
New Generation (Eden + 1 Survivor Space):
   capacity = 707788800 (675.0MB)
   used     = 383204272 (365.4520721435547MB)
   free     = 324584528 (309.5479278564453MB)
   54.14104772497107% used
Eden Space:
   capacity = 629145600 (600.0MB)
   used     = 334989624 (319.4710006713867MB)
   free     = 294155976 (280.5289993286133MB)
   53.24516677856445% used
From Space:
   capacity = 78643200 (75.0MB)
   used     = 48214648 (45.98107147216797MB)
   free     = 30428552 (29.01892852783203MB)
   61.30809529622396% used
To Space:
   capacity = 78643200 (75.0MB)
   used     = 0 (0.0MB)
   free     = 78643200 (75.0MB)
   0.0% used
concurrent mark-sweep generation:
   capacity = 1361051648 (1298.0MB)
   used     = 985748664 (940.0831832885742MB)
   free     = 375302984 (357.9168167114258MB)
   72.4255148912615% used

49647 interned Strings occupying 5512480 bytes.