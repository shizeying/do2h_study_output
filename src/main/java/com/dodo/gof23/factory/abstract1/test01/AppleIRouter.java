package com.dodo.gof23.factory.abstract1.test01;

public class AppleIRouter implements IRouterProduct{
		
		@Override
		public void start() {
				System.out.println("Apple路由器开机！");
		}
		
		@Override
		public void shutdown() {
				System.out.println("Apple路由器关机！");
		}
		
		@Override
		public void openWifi() {
				System.out.println("Apple路由器打开wifi！");
		}
		
		@Override
		public void setting() {
				System.out.println("Apple路由器设置密码！");
		}
}