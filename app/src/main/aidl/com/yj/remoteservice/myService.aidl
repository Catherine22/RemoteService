// myService.aidl
package com.yj.remoteservice;

// Declare any non-default types here with import statements
//生成aidl：
//1. 右键-new AIDL
//2. 检查生成的aidl档package与manifest的package路径要一样
//3. 选择生成的aidl，Build-Make Project，就会生成相应的java文件（路径在app/build/generated/source/aidl/debug/
//reference:http://www.cnblogs.com/teenyboy/p/4197722.html
interface myService {
    void callMethodInService();
}
