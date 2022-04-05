package org.proxydroid.utils;

public class Constraints {

	public static final String ONLY_3G = "2G/3G";
	public static final String ONLY_WIFI = "WIFI";
	public static final String WIFI_AND_3G = "WIFI/2G/3G";
	public static final String FILE_PATH = "file_path";
	public static final int IMPORT_REQUEST = 0;

	public static final String[][] PRESETS = {
			{},
			{ "127.0.0.1" },
			{ "127.0.0.1", "10.0.0.0/8", "192.168.0.0/16", "172.16.0.0/12" },
			// China routes are gotten from https://github.com/17mon/china_ip_list
			// Shrinked for better performance by remove subnets which have netmasks >= 20.
            {
                "1.0.32.0/19", "1.1.32.0/19", "1.2.32.0/19", "1.2.64.0/18",
                "1.3.0.0/16", "1.4.32.0/19", "1.4.64.0/18", "1.8.32.0/19",
                "1.8.64.0/19", "1.8.160.0/19", "1.8.192.0/19", "1.10.32.0/19",
                "1.10.64.0/18", "1.12.0.0/14", "1.24.0.0/13", "1.45.0.0/16",
                "1.48.0.0/14", "1.56.0.0/13", "1.68.0.0/14", "1.80.0.0/12",
                "1.116.0.0/14", "1.180.0.0/14", "1.184.0.0/15", "1.188.0.0/14",
                "1.192.0.0/13", "1.202.0.0/15", "1.204.0.0/14", "14.16.0.0/12",
                "14.103.0.0/16", "14.104.0.0/13", "14.112.0.0/12", "14.130.0.0/15",
                "14.134.0.0/15", "14.144.0.0/12", "14.196.0.0/15", "14.204.0.0/15",
                "14.208.0.0/12", "27.8.0.0/13", "27.16.0.0/12", "27.36.0.0/14",
                "27.40.0.0/13", "27.50.128.0/17", "27.54.192.0/18", "27.98.224.0/19",
                "27.99.128.0/17", "27.103.0.0/16", "27.106.128.0/18", "27.109.32.0/19",
                "27.112.0.0/18", "27.113.128.0/18", "27.115.0.0/17", "27.128.0.0/15",
                "27.144.0.0/16", "27.148.0.0/14", "27.152.0.0/13", "27.184.0.0/13",
                "27.192.0.0/11", "27.224.0.0/14", "36.0.32.0/19", "36.0.64.0/18",
                "36.0.128.0/17", "36.1.0.0/16", "36.4.0.0/14", "36.16.0.0/12",
                "36.32.0.0/14", "36.36.0.0/16", "36.37.0.0/19", "36.40.0.0/13",
                "36.48.0.0/15", "36.51.0.0/17", "36.51.128.0/18", "36.51.192.0/19",
                "36.56.0.0/13", "36.96.0.0/11", "36.128.0.0/10", "36.192.0.0/11",
                "36.248.0.0/14", "36.254.0.0/16", "39.0.32.0/19", "39.0.64.0/18",
                "39.0.128.0/17", "39.64.0.0/11", "39.96.0.0/13", "39.104.0.0/14",
                "39.108.0.0/16", "39.128.0.0/10", "40.72.0.0/16", "40.125.128.0/17",
                "40.126.64.0/18", "42.0.32.0/19", "42.0.128.0/19", "42.0.224.0/19",
                "42.1.0.0/19", "42.4.0.0/14", "42.48.0.0/13", "42.56.0.0/14",
                "42.62.0.0/17", "42.62.128.0/19", "42.63.0.0/16", "42.80.0.0/15",
                "42.83.96.0/19", "42.83.160.0/19", "42.83.192.0/18", "42.84.0.0/14",
                "42.88.0.0/13", "42.96.64.0/19", "42.96.128.0/17", "42.97.0.0/16",
                "42.99.0.0/18", "42.99.64.0/19", "42.100.0.0/14", "42.120.0.0/15",
                "42.122.0.0/16", "42.123.0.0/19", "42.123.64.0/18", "42.123.128.0/19",
                "42.123.192.0/18", "42.128.0.0/12", "42.156.0.0/19", "42.156.64.0/18",
                "42.156.128.0/17", "42.157.0.0/16", "42.158.0.0/15", "42.160.0.0/12",
                "42.176.0.0/13", "42.184.0.0/15", "42.186.0.0/16", "42.187.0.0/18",
                "42.187.64.0/19", "42.187.128.0/17", "42.192.0.0/13", "42.201.0.0/17",
                "42.202.0.0/15", "42.204.0.0/14", "42.208.0.0/12", "42.224.0.0/12",
                "42.240.0.0/16", "42.242.0.0/15", "42.244.0.0/15", "42.246.0.0/16",
                "42.247.32.0/19", "42.247.64.0/18", "42.247.128.0/17", "42.248.0.0/13",
                "43.226.32.0/19", "43.226.64.0/19", "43.226.128.0/18", "43.227.32.0/19",
                "43.227.64.0/19", "43.227.192.0/19", "43.228.0.0/18", "43.230.224.0/19",
                "43.236.0.0/15", "43.238.0.0/16", "43.239.0.0/19", "43.240.160.0/19",
                "43.240.192.0/19", "43.246.0.0/18", "43.246.64.0/19", "43.247.224.0/19",
                "43.248.96.0/19", "45.122.0.0/19", "45.122.64.0/19", "45.122.160.0/19",
                "45.123.224.0/19", "45.221.0.0/16", "45.248.224.0/19", "45.251.160.0/19",
                "45.251.192.0/19", "45.252.0.0/19", "45.252.96.0/19", "45.252.128.0/19",
                "45.252.192.0/19", "45.253.0.0/18", "45.253.160.0/19", "45.253.192.0/18",
                "45.254.0.0/19", "45.254.64.0/18", "45.254.128.0/18", "45.254.192.0/19",
                "45.255.0.0/17", "45.255.160.0/19", "45.255.192.0/19", "47.92.0.0/14",
                "47.96.0.0/11", "49.4.0.0/14", "49.51.32.0/19", "49.51.64.0/18",
                "49.51.128.0/17", "49.52.0.0/14", "49.64.0.0/11", "49.112.0.0/13",
                "49.120.0.0/14", "49.140.0.0/15", "49.152.0.0/14", "49.208.0.0/14",
                "49.220.0.0/14", "49.232.0.0/14", "49.239.0.0/18", "49.239.192.0/18",
                "52.80.0.0/16", "54.222.0.0/15", "58.14.0.0/15", "58.16.0.0/13",
                "58.24.0.0/15", "58.30.0.0/15", "58.32.0.0/11", "58.66.0.0/15",
                "58.68.128.0/19", "58.68.224.0/19", "58.82.0.0/17", "58.83.0.0/16",
                "58.87.64.0/18", "58.99.128.0/17", "58.100.0.0/15", "58.116.0.0/14",
                "58.128.0.0/13", "58.144.0.0/16", "58.154.0.0/15", "58.192.0.0/11",
                "58.240.0.0/12", "59.32.0.0/11", "59.64.0.0/12", "59.81.0.0/16",
                "59.82.0.0/16", "59.83.0.0/18", "59.83.128.0/17", "59.107.0.0/16",
                "59.108.0.0/14", "59.151.0.0/17", "59.155.0.0/16", "59.172.0.0/14",
                "59.191.0.0/17", "59.192.0.0/10", "60.0.0.0/11", "60.55.0.0/16",
                "60.63.0.0/16", "60.160.0.0/11", "60.194.0.0/15", "60.200.0.0/13",
                "60.208.0.0/12", "60.232.0.0/15", "60.235.0.0/16", "60.245.128.0/17",
                "60.247.0.0/16", "60.252.0.0/16", "60.253.128.0/17", "60.255.0.0/16",
                "61.28.0.0/17", "61.29.128.0/18", "61.29.192.0/19", "61.45.128.0/18",
                "61.47.128.0/18", "61.48.0.0/13", "61.87.192.0/18", "61.128.0.0/10",
                "61.232.0.0/14", "61.236.0.0/15", "61.240.0.0/14", "101.4.0.0/14",
                "101.16.0.0/12", "101.32.0.0/15", "101.34.0.0/16", "101.35.32.0/19",
                "101.35.96.0/19", "101.35.128.0/17", "101.36.0.0/18", "101.36.96.0/19",
                "101.36.128.0/17", "101.37.0.0/16", "101.38.0.0/15", "101.40.0.0/13",
                "101.48.32.0/19", "101.48.64.0/19", "101.48.128.0/17", "101.49.0.0/16",
                "101.52.0.0/16", "101.54.0.0/16", "101.64.0.0/13", "101.72.0.0/14",
                "101.76.0.0/15", "101.78.32.0/19", "101.80.0.0/12", "101.96.128.0/19",
                "101.96.192.0/19", "101.99.96.0/19", "101.101.64.0/19", "101.102.64.0/19",
                "101.104.0.0/14", "101.110.64.0/19", "101.120.0.0/14", "101.124.0.0/17",
                "101.124.192.0/18", "101.125.0.0/16", "101.126.0.0/16", "101.128.32.0/19",
                "101.129.0.0/16", "101.130.0.0/15", "101.132.0.0/14", "101.144.0.0/12",
                "101.192.0.0/14", "101.196.0.0/17", "101.196.128.0/19", "101.196.192.0/18",
                "101.197.0.0/16", "101.198.0.0/15", "101.200.0.0/15", "101.203.128.0/19",
                "101.204.0.0/14", "101.224.0.0/13", "101.232.0.0/15", "101.234.96.0/19",
                "101.236.0.0/17", "101.236.128.0/18", "101.236.192.0/19", "101.237.0.0/16",
                "101.238.0.0/15", "101.240.0.0/13", "101.248.0.0/15", "101.251.32.0/19",
                "101.251.64.0/18", "101.251.128.0/17", "101.252.0.0/15", "101.254.0.0/18",
                "101.254.96.0/19", "101.254.128.0/17", "103.3.96.0/19", "103.22.0.0/18",
                "103.22.64.0/19", "103.32.0.0/15", "103.34.0.0/16", "103.35.0.0/19",
                "103.36.160.0/19", "103.36.192.0/19", "103.39.160.0/19", "103.45.0.0/18",
                "103.45.96.0/19", "103.45.128.0/18", "103.45.192.0/19", "103.46.32.0/19",
                "103.46.64.0/18", "103.62.96.0/19", "103.62.160.0/19", "103.63.32.0/19",
                "103.64.32.0/19", "103.64.64.0/18", "103.64.160.0/19", "103.64.192.0/18",
                "103.65.64.0/19", "103.192.0.0/19", "103.200.160.0/19", "103.200.224.0/19",
                "103.201.32.0/19", "103.201.160.0/19", "103.201.192.0/18", "103.202.0.0/19",
                "103.202.64.0/18", "103.202.160.0/19", "103.203.0.0/19", "103.203.96.0/19",
                "103.210.160.0/19", "103.213.64.0/19", "103.213.160.0/19", "103.217.0.0/18",
                "103.218.32.0/19", "103.218.64.0/19", "103.220.160.0/19", "103.221.0.0/19",
                "103.221.96.0/19", "103.221.128.0/18", "103.222.32.0/19", "103.222.64.0/18",
                "103.222.128.0/18", "103.222.192.0/19", "103.223.32.0/19", "103.223.64.0/18",
                "103.223.192.0/18", "103.235.224.0/19", "103.236.0.0/18", "103.236.64.0/19",
                "103.237.192.0/18", "103.238.160.0/19", "106.0.64.0/18", "106.2.32.0/19",
                "106.2.64.0/18", "106.2.128.0/17", "106.3.32.0/19", "106.3.96.0/19",
                "106.3.128.0/17", "106.4.0.0/14", "106.8.0.0/15", "106.11.0.0/16",
                "106.12.0.0/14", "106.16.0.0/12", "106.32.0.0/12", "106.48.64.0/18",
                "106.48.128.0/17", "106.49.32.0/19", "106.49.64.0/19", "106.49.128.0/17",
                "106.50.0.0/16", "106.52.0.0/14", "106.56.0.0/13", "106.74.0.0/16",
                "106.75.0.0/17", "106.75.128.0/18", "106.75.224.0/19", "106.80.0.0/12",
                "106.108.0.0/14", "106.112.0.0/12", "106.224.0.0/12", "110.6.0.0/15",
                "110.16.0.0/14", "110.40.0.0/14", "110.48.0.0/17", "110.48.128.0/19",
                "110.48.192.0/18", "110.51.0.0/16", "110.52.0.0/15", "110.56.0.0/13",
                "110.64.0.0/15", "110.72.0.0/15", "110.75.0.0/16", "110.76.32.0/19",
                "110.76.192.0/18", "110.77.0.0/17", "110.80.0.0/13", "110.88.0.0/14",
                "110.93.32.0/19", "110.94.0.0/15", "110.96.0.0/11", "110.152.0.0/14",
                "110.156.0.0/15", "110.166.0.0/15", "110.172.192.0/18", "110.173.0.0/19",
                "110.173.64.0/19", "110.173.192.0/19", "110.176.0.0/12", "110.192.0.0/11",
                "110.228.0.0/14", "110.232.32.0/19", "110.236.0.0/15", "110.240.0.0/12",
                "111.0.0.0/10", "111.66.0.0/16", "111.68.64.0/19", "111.72.0.0/13",
                "111.85.0.0/16", "111.112.0.0/14", "111.116.0.0/15", "111.119.96.0/19",
                "111.119.128.0/19", "111.120.0.0/14", "111.124.0.0/16", "111.126.0.0/15",
                "111.128.0.0/11", "111.160.0.0/13", "111.170.0.0/16", "111.172.0.0/14",
                "111.176.0.0/13", "111.186.0.0/15", "111.192.0.0/12", "111.208.0.0/13",
                "111.221.128.0/17", "111.222.0.0/16", "111.224.0.0/13", "111.235.96.0/19",
                "112.0.0.0/10", "112.64.0.0/14", "112.73.64.0/18", "112.74.0.0/15",
                "112.80.0.0/12", "112.96.0.0/13", "112.109.128.0/17", "112.111.0.0/16",
                "112.112.0.0/14", "112.116.0.0/15", "112.122.0.0/15", "112.124.0.0/14",
                "112.128.0.0/14", "112.132.0.0/16", "112.192.0.0/14", "112.224.0.0/11",
                "113.0.0.0/13", "113.8.0.0/15", "113.11.192.0/19", "113.12.0.0/14",
                "113.16.0.0/15", "113.18.0.0/16", "113.24.0.0/14", "113.31.0.0/16",
                "113.44.0.0/14", "113.48.0.0/14", "113.54.0.0/15", "113.56.0.0/15",
                "113.58.0.0/16", "113.59.0.0/17", "113.62.0.0/15", "113.64.0.0/10",
                "113.128.0.0/15", "113.132.0.0/14", "113.136.0.0/13", "113.194.0.0/15",
                "113.200.0.0/15", "113.202.0.0/16", "113.204.0.0/14", "113.208.96.0/19",
                "113.208.128.0/17", "113.209.0.0/16", "113.212.0.0/18", "113.213.0.0/17",
                "113.214.0.0/15", "113.218.0.0/15", "113.220.0.0/14", "113.224.0.0/12",
                "113.240.0.0/13", "113.248.0.0/14", "114.28.0.0/16", "114.54.0.0/15",
                "114.60.0.0/14", "114.64.0.0/14", "114.68.32.0/19", "114.68.64.0/18",
                "114.68.128.0/17", "114.79.64.0/18", "114.80.0.0/12", "114.96.0.0/13",
                "114.104.0.0/14", "114.110.64.0/18", "114.111.0.0/19", "114.111.160.0/19",
                "114.112.32.0/19", "114.112.64.0/19", "114.112.160.0/19", "114.112.192.0/19",
                "114.113.0.0/17", "114.113.160.0/19", "114.114.0.0/16", "114.115.0.0/18",
                "114.115.96.0/19", "114.115.128.0/17", "114.116.0.0/14", "114.132.0.0/18",
                "114.132.64.0/19", "114.132.128.0/17", "114.135.0.0/16", "114.138.0.0/15",
                "114.141.128.0/18", "114.196.0.0/15", "114.208.0.0/12", "114.224.0.0/11",
                "115.24.0.0/14", "115.28.0.0/15", "115.32.0.0/14", "115.44.0.0/14",
                "115.48.0.0/12", "115.84.0.0/18", "115.85.192.0/18", "115.100.0.0/14",
                "115.104.0.0/14", "115.120.0.0/14", "115.148.0.0/14", "115.152.0.0/13",
                "115.166.64.0/19", "115.168.0.0/13", "115.180.0.0/14", "115.190.0.0/15",
                "115.192.0.0/11", "115.224.0.0/12", "116.1.0.0/16", "116.2.0.0/15",
                "116.4.0.0/14", "116.8.0.0/14", "116.13.0.0/16", "116.16.0.0/12",
                "116.52.0.0/14", "116.56.0.0/15", "116.60.0.0/14", "116.66.0.0/18",
                "116.66.64.0/19", "116.69.0.0/16", "116.70.0.0/17", "116.76.0.0/14",
                "116.85.0.0/16", "116.95.0.0/16", "116.112.0.0/14", "116.116.0.0/15",
                "116.128.0.0/15", "116.131.0.0/16", "116.132.0.0/14", "116.136.0.0/13",
                "116.144.0.0/12", "116.160.0.0/13", "116.168.0.0/15", "116.178.0.0/15",
                "116.180.0.0/14", "116.184.0.0/13", "116.192.0.0/16", "116.193.32.0/19",
                "116.194.0.0/15", "116.196.64.0/18", "116.196.128.0/17", "116.198.0.0/16",
                "116.199.0.0/17", "116.204.0.0/15", "116.207.0.0/16", "116.208.0.0/14",
                "116.213.64.0/18", "116.213.128.0/17", "116.214.32.0/19", "116.214.128.0/17",
                "116.215.0.0/16", "116.216.0.0/14", "116.224.0.0/12", "116.242.0.0/15",
                "116.244.0.0/14", "116.248.0.0/15", "116.252.0.0/15", "116.254.128.0/17",
                "116.255.128.0/17", "117.8.0.0/13", "117.21.0.0/16", "117.22.0.0/15",
                "117.24.0.0/13", "117.32.0.0/13", "117.40.0.0/14", "117.44.0.0/15",
                "117.48.0.0/14", "117.57.0.0/16", "117.58.0.0/18", "117.59.0.0/16",
                "117.60.0.0/14", "117.64.0.0/13", "117.72.0.0/15", "117.74.64.0/19",
                "117.74.128.0/17", "117.75.0.0/16", "117.76.0.0/14", "117.80.0.0/12",
                "117.100.0.0/15", "117.106.0.0/15", "117.112.0.0/13", "117.120.96.0/19",
                "117.120.128.0/17", "117.121.0.0/19", "117.121.64.0/18", "117.121.160.0/19",
                "117.122.128.0/17", "117.124.0.0/14", "117.128.0.0/10", "118.24.0.0/16",
                "118.25.96.0/19", "118.25.128.0/17", "118.26.0.0/19", "118.26.64.0/19",
                "118.26.128.0/17", "118.28.0.0/14", "118.64.0.0/15", "118.66.0.0/16",
                "118.72.0.0/13", "118.80.0.0/15", "118.84.0.0/15", "118.88.32.0/19",
                "118.88.64.0/18", "118.88.128.0/17", "118.89.0.0/16", "118.112.0.0/13",
                "118.120.0.0/14", "118.124.0.0/15", "118.126.32.0/19", "118.126.64.0/18",
                "118.126.128.0/17", "118.127.128.0/19", "118.132.0.0/14", "118.144.0.0/14",
                "118.178.0.0/16", "118.180.0.0/14", "118.184.96.0/19", "118.184.128.0/17",
                "118.186.0.0/15", "118.188.0.0/16", "118.190.0.0/15", "118.192.0.0/16",
                "118.193.96.0/19", "118.194.32.0/19", "118.194.64.0/18", "118.194.128.0/18",
                "118.194.192.0/19", "118.195.0.0/16", "118.196.0.0/14", "118.202.0.0/15",
                "118.204.0.0/14", "118.212.0.0/15", "118.215.192.0/19", "118.224.0.0/14",
                "118.228.0.0/17", "118.228.160.0/19", "118.228.192.0/18", "118.229.0.0/16",
                "118.230.0.0/16", "118.239.0.0/16", "118.242.0.0/16", "118.244.0.0/14",
                "118.248.0.0/13", "119.0.0.0/15", "119.2.0.0/19", "119.2.128.0/17",
                "119.3.0.0/16", "119.4.0.0/14", "119.8.0.0/16", "119.10.0.0/17",
                "119.16.0.0/16", "119.19.0.0/16", "119.20.0.0/14", "119.27.64.0/18",
                "119.27.128.0/17", "119.28.128.0/17", "119.29.0.0/16", "119.31.192.0/19",
                "119.32.0.0/14", "119.36.0.0/15", "119.38.0.0/17", "119.38.128.0/18",
                "119.38.192.0/19", "119.39.0.0/16", "119.40.0.0/18", "119.40.128.0/17",
                "119.41.0.0/16", "119.42.0.0/19", "119.42.224.0/19", "119.44.0.0/15",
                "119.48.0.0/13", "119.57.0.0/16", "119.58.0.0/16", "119.59.128.0/17",
                "119.60.0.0/15", "119.62.0.0/16", "119.63.32.0/19", "119.78.0.0/15",
                "119.80.0.0/16", "119.84.0.0/14", "119.88.0.0/14", "119.96.0.0/13",
                "119.108.0.0/15", "119.112.0.0/12", "119.128.0.0/12", "119.144.0.0/14",
                "119.148.160.0/19", "119.151.192.0/18", "119.161.128.0/17", "119.162.0.0/15",
                "119.164.0.0/14", "119.176.0.0/12", "119.232.0.0/15", "119.248.0.0/14",
                "119.253.0.0/16", "119.254.0.0/15", "120.0.0.0/12", "120.24.0.0/14",
                "120.30.0.0/18", "120.30.96.0/19", "120.30.128.0/17", "120.31.0.0/17",
                "120.31.160.0/19", "120.31.192.0/18", "120.32.0.0/12", "120.48.0.0/15",
                "120.52.0.0/14", "120.64.0.0/13", "120.72.32.0/19", "120.72.128.0/17",
                "120.76.0.0/14", "120.80.0.0/13", "120.90.0.0/15", "120.92.0.0/16",
                "120.94.0.0/15", "120.128.0.0/14", "120.132.0.0/17", "120.132.128.0/18",
                "120.132.192.0/19", "120.133.0.0/16", "120.134.0.0/15", "120.136.128.0/18",
                "120.137.0.0/18", "120.137.96.0/19", "120.143.128.0/19", "120.192.0.0/10",
                "121.4.0.0/15", "121.8.0.0/13", "121.16.0.0/12", "121.32.0.0/13",
                "121.40.0.0/14", "121.46.0.0/18", "121.46.128.0/17", "121.47.0.0/16",
                "121.48.0.0/15", "121.51.0.0/16", "121.52.160.0/19", "121.52.224.0/19",
                "121.55.0.0/18", "121.56.0.0/15", "121.58.0.0/17", "121.59.0.0/16",
                "121.60.0.0/14", "121.68.0.0/14", "121.76.0.0/15", "121.79.128.0/18",
                "121.89.0.0/16", "121.101.0.0/18", "121.192.0.0/13", "121.201.0.0/18",
                "121.201.96.0/19", "121.201.128.0/17", "121.204.0.0/14", "121.224.0.0/12",
                "121.248.0.0/14", "121.255.0.0/16", "122.0.64.0/18", "122.0.128.0/17",
                "122.4.0.0/14", "122.8.32.0/19", "122.8.64.0/18", "122.8.224.0/19",
                "122.11.0.0/17", "122.12.0.0/15", "122.14.0.0/17", "122.14.192.0/18",
                "122.48.0.0/16", "122.49.0.0/18", "122.51.0.0/16", "122.64.0.0/11",
                "122.96.0.0/15", "122.102.64.0/19", "122.112.0.0/18", "122.112.64.0/19",
                "122.112.128.0/17", "122.113.0.0/16", "122.114.0.0/16", "122.115.0.0/18",
                "122.115.96.0/19", "122.115.128.0/17", "122.119.0.0/16", "122.136.0.0/13",
                "122.144.128.0/17", "122.152.192.0/18", "122.156.0.0/14", "122.188.0.0/14",
                "122.192.0.0/14", "122.198.0.0/16", "122.200.64.0/18", "122.204.0.0/14",
                "122.224.0.0/12", "122.240.0.0/13", "123.4.0.0/14", "123.8.0.0/13",
                "123.49.160.0/19", "123.49.192.0/18", "123.50.160.0/19", "123.52.0.0/14",
                "123.56.0.0/15", "123.58.0.0/18", "123.58.96.0/19", "123.58.128.0/17",
                "123.59.0.0/16", "123.61.0.0/16", "123.62.0.0/16", "123.64.0.0/11",
                "123.96.0.0/15", "123.98.0.0/17", "123.99.128.0/17", "123.100.0.0/19",
                "123.101.0.0/16", "123.103.32.0/19", "123.103.64.0/18", "123.112.0.0/12",
                "123.128.0.0/13", "123.137.0.0/16", "123.138.0.0/15", "123.144.0.0/12",
                "123.160.0.0/12", "123.177.0.0/16", "123.178.0.0/15", "123.180.0.0/14",
                "123.184.0.0/13", "123.196.0.0/15", "123.199.128.0/17", "123.206.0.0/15",
                "123.232.0.0/14", "123.242.0.0/17", "123.244.0.0/14", "123.249.0.0/16",
                "123.253.0.0/16", "124.6.64.0/18", "124.14.0.0/15", "124.16.0.0/15",
                "124.20.0.0/14", "124.28.192.0/18", "124.29.0.0/17", "124.31.0.0/16",
                "124.40.128.0/18", "124.40.192.0/19", "124.42.0.0/16", "124.47.0.0/18",
                "124.64.0.0/15", "124.66.0.0/17", "124.67.0.0/16", "124.68.0.0/15",
                "124.72.0.0/13", "124.88.0.0/13", "124.112.0.0/13", "124.126.0.0/15",
                "124.128.0.0/13", "124.147.128.0/17", "124.151.0.0/16", "124.152.0.0/16",
                "124.156.0.0/16", "124.160.0.0/13", "124.172.0.0/14", "124.192.0.0/15",
                "124.196.0.0/16", "124.200.0.0/13", "124.220.0.0/14", "124.224.0.0/12",
                "124.240.0.0/17", "124.240.128.0/18", "124.242.0.0/16", "124.243.192.0/18",
                "124.248.0.0/17", "124.249.0.0/16", "124.250.0.0/17", "124.250.160.0/19",
                "124.250.192.0/18", "124.251.0.0/16", "124.254.0.0/18", "125.31.192.0/18",
                "125.32.0.0/12", "125.58.128.0/17", "125.61.128.0/17", "125.62.0.0/18",
                "125.64.0.0/11", "125.96.0.0/15", "125.98.0.0/16", "125.104.0.0/13",
                "125.112.0.0/12", "125.169.0.0/16", "125.171.0.0/16", "125.208.0.0/19",
                "125.210.0.0/15", "125.213.0.0/17", "125.214.96.0/19", "125.215.0.0/18",
                "125.216.0.0/13", "125.254.128.0/17", "139.9.0.0/16", "139.129.0.0/16",
                "139.148.0.0/16", "139.155.0.0/16", "139.159.0.0/19", "139.159.64.0/19",
                "139.159.128.0/17", "139.170.0.0/16", "139.176.0.0/16", "139.183.0.0/16",
                "139.186.0.0/16", "139.189.0.0/16", "139.196.0.0/14", "139.200.0.0/13",
                "139.208.0.0/13", "139.217.0.0/16", "139.219.0.0/16", "139.220.0.0/15",
                "139.224.0.0/16", "139.226.0.0/15", "140.75.0.0/16", "140.143.0.0/16",
                "140.205.32.0/19", "140.205.64.0/19", "140.205.128.0/17", "140.206.0.0/15",
                "140.210.0.0/16", "140.224.0.0/16", "140.237.0.0/16", "140.240.0.0/16",
                "140.243.0.0/16", "140.246.0.0/16", "140.249.0.0/16", "140.250.0.0/16",
                "140.255.0.0/16", "144.0.0.0/16", "144.7.0.0/16", "144.12.0.0/16",
                "144.52.0.0/16", "144.123.0.0/16", "144.255.0.0/16", "150.0.0.0/16",
                "150.115.0.0/16", "150.121.0.0/16", "150.122.0.0/16", "150.138.0.0/15",
                "150.223.0.0/16", "150.255.0.0/16", "152.104.128.0/17", "153.0.0.0/16",
                "153.3.0.0/16", "153.34.0.0/15", "153.36.0.0/15", "153.99.0.0/16",
                "153.101.0.0/16", "153.118.0.0/15", "157.0.0.0/16", "157.18.0.0/16",
                "157.61.0.0/16", "157.122.0.0/16", "157.148.0.0/16", "157.156.0.0/16",
                "157.255.0.0/16", "159.226.0.0/16", "160.202.224.0/19", "161.207.0.0/16",
                "162.105.0.0/16", "163.0.0.0/16", "163.53.96.0/19", "163.125.0.0/16",
                "163.142.0.0/16", "163.177.0.0/16", "163.179.0.0/16", "163.204.0.0/16",
                "166.111.0.0/16", "167.139.0.0/16", "168.160.0.0/16", "171.8.0.0/13",
                "171.34.0.0/15", "171.36.0.0/14", "171.40.0.0/13", "171.80.0.0/12",
                "171.104.0.0/13", "171.112.0.0/12", "171.208.0.0/12", "175.0.0.0/12",
                "175.16.0.0/13", "175.24.0.0/14", "175.30.0.0/15", "175.42.0.0/15",
                "175.44.0.0/16", "175.46.0.0/15", "175.48.0.0/12", "175.64.0.0/11",
                "175.102.0.0/16", "175.106.128.0/17", "175.146.0.0/15", "175.148.0.0/14",
                "175.152.0.0/14", "175.160.0.0/12", "175.178.0.0/16", "175.184.128.0/18",
                "175.185.0.0/16", "175.186.0.0/15", "175.188.0.0/14", "180.76.32.0/19",
                "180.76.96.0/19", "180.76.128.0/18", "180.76.192.0/19", "180.77.0.0/16",
                "180.78.0.0/15", "180.84.0.0/15", "180.86.0.0/16", "180.88.0.0/14",
                "180.95.128.0/17", "180.96.0.0/11", "180.129.128.0/17", "180.130.0.0/16",
                "180.136.0.0/13", "180.148.224.0/19", "180.149.128.0/19", "180.152.0.0/13",
                "180.160.0.0/12", "180.178.192.0/18", "180.184.0.0/14", "180.188.0.0/17",
                "180.201.0.0/16", "180.202.0.0/15", "180.208.0.0/15", "180.212.0.0/15",
                "180.222.224.0/19", "180.223.0.0/16", "180.233.0.0/18", "180.233.64.0/19",
                "180.235.64.0/19", "182.16.192.0/19", "182.18.0.0/17", "182.32.0.0/12",
                "182.48.96.0/19", "182.49.0.0/16", "182.51.0.0/17", "182.51.128.0/18",
                "182.51.224.0/19", "182.54.0.0/17", "182.61.0.0/18", "182.61.128.0/17",
                "182.80.0.0/13", "182.88.0.0/14", "182.92.0.0/16", "182.96.0.0/11",
                "182.128.0.0/12", "182.144.0.0/13", "182.157.0.0/16", "182.174.0.0/15",
                "182.200.0.0/13", "182.236.128.0/17", "182.238.0.0/16", "182.239.0.0/19",
                "182.240.0.0/13", "182.254.0.0/16", "183.0.0.0/10", "183.64.0.0/13",
                "183.84.0.0/15", "183.92.0.0/14", "183.128.0.0/11", "183.160.0.0/13",
                "183.168.0.0/15", "183.170.0.0/16", "183.172.0.0/14", "183.184.0.0/13",
                "183.192.0.0/10", "192.140.160.0/19", "202.4.128.0/19", "202.8.128.0/19",
                "202.38.64.0/18", "202.38.192.0/18", "202.63.160.0/19", "202.70.0.0/19",
                "202.91.224.0/19", "202.94.0.0/19", "202.95.0.0/19", "202.96.0.0/12",
                "202.112.0.0/13", "202.120.0.0/15", "202.122.64.0/19", "202.127.128.0/19",
                "202.127.224.0/19", "202.130.0.0/19", "202.130.224.0/19", "202.141.160.0/19",
                "202.148.64.0/18", "202.149.32.0/19", "202.149.160.0/19", "202.149.224.0/19",
                "202.150.224.0/19", "202.151.128.0/19", "202.157.192.0/19", "202.158.160.0/19",
                "202.164.96.0/19", "202.166.224.0/19", "202.168.160.0/19", "202.170.128.0/19",
                "202.170.224.0/19", "202.173.224.0/19", "202.176.224.0/19", "202.180.128.0/19",
                "202.182.192.0/19", "202.189.0.0/18", "202.192.0.0/12", "203.86.0.0/18",
                "203.86.64.0/19", "203.88.32.0/19", "203.88.192.0/19", "203.90.128.0/18",
                "203.90.192.0/19", "203.91.32.0/19", "203.92.160.0/19", "203.93.0.0/16",
                "203.94.0.0/19", "203.95.96.0/19", "203.95.128.0/18", "203.95.224.0/19",
                "203.100.96.0/19", "203.105.96.0/19", "203.105.128.0/19", "203.107.0.0/17",
                "203.110.160.0/19", "203.118.192.0/19", "203.119.128.0/17", "203.128.32.0/19",
                "203.128.96.0/19", "203.132.32.0/19", "203.135.96.0/19", "203.142.224.0/19",
                "203.145.0.0/19", "203.148.0.0/18", "203.152.64.0/19", "203.152.128.0/19",
                "203.156.192.0/18", "203.160.192.0/19", "203.161.192.0/19", "203.166.160.0/19",
                "203.168.0.0/19", "203.174.96.0/19", "203.175.128.0/19", "203.175.192.0/18",
                "203.176.0.0/19", "203.176.64.0/19", "203.187.160.0/19", "203.189.192.0/19",
                "203.191.64.0/18", "203.192.0.0/19", "203.193.224.0/19", "203.195.64.0/19",
                "203.195.128.0/17", "203.205.64.0/19", "203.207.64.0/18", "203.207.128.0/17",
                "203.208.32.0/19", "203.209.224.0/19", "210.5.0.0/19", "210.5.128.0/19",
                "210.12.0.0/15", "210.14.64.0/19", "210.14.128.0/17", "210.15.0.0/17",
                "210.15.128.0/18", "210.16.160.0/19", "210.21.0.0/16", "210.22.0.0/16",
                "210.23.32.0/19", "210.25.0.0/16", "210.26.0.0/15", "210.28.0.0/14",
                "210.32.0.0/12", "210.51.0.0/16", "210.52.0.0/16", "210.53.0.0/18",
                "210.53.64.0/19", "210.53.128.0/17", "210.56.192.0/19", "210.72.0.0/14",
                "210.76.0.0/15", "210.78.0.0/16", "210.79.64.0/18", "210.79.224.0/19",
                "210.82.0.0/15", "210.87.128.0/18", "210.185.192.0/18", "210.192.96.0/19",
                "211.64.0.0/13", "211.80.0.0/12", "211.96.0.0/15", "211.98.0.0/16",
                "211.99.0.0/18", "211.99.64.0/19", "211.99.128.0/17", "211.100.0.0/14",
                "211.136.0.0/13", "211.144.0.0/13", "211.152.0.0/15", "211.154.0.0/19",
                "211.154.64.0/18", "211.154.128.0/17", "211.155.0.0/18", "211.155.96.0/19",
                "211.155.128.0/17", "211.156.0.0/18", "211.156.64.0/19", "211.156.128.0/17",
                "211.157.0.0/16", "211.158.0.0/15", "211.160.0.0/13", "218.0.0.0/12",
                "218.16.0.0/13", "218.24.0.0/14", "218.28.0.0/15", "218.30.0.0/19",
                "218.30.64.0/18", "218.30.128.0/17", "218.31.0.0/16", "218.56.0.0/13",
                "218.64.0.0/11", "218.96.0.0/15", "218.98.32.0/19", "218.98.128.0/19",
                "218.98.192.0/18", "218.99.0.0/16", "218.100.96.0/19", "218.100.128.0/17",
                "218.104.0.0/14", "218.108.0.0/15", "218.192.0.0/12", "218.240.0.0/14",
                "218.244.0.0/15", "218.246.0.0/17", "218.246.160.0/19", "218.246.192.0/18",
                "218.247.0.0/18", "218.247.96.0/19", "218.247.128.0/17", "218.249.0.0/16",
                "219.72.0.0/16", "219.82.0.0/16", "219.83.128.0/17", "219.128.0.0/11",
                "219.216.0.0/13", "219.224.0.0/13", "219.232.0.0/15", "219.234.32.0/19",
                "219.234.64.0/18", "219.234.128.0/17", "219.235.0.0/16", "219.236.0.0/14",
                "219.242.0.0/15", "219.244.0.0/14", "220.101.192.0/18", "220.112.0.0/14",
                "220.152.128.0/17", "220.154.0.0/17", "220.154.160.0/19", "220.154.192.0/18",
                "220.155.32.0/19", "220.155.64.0/18", "220.155.128.0/17", "220.160.0.0/11",
                "220.192.0.0/12", "220.231.0.0/18", "220.231.128.0/17", "220.232.64.0/18",
                "220.234.0.0/16", "220.242.0.0/16", "220.243.0.0/17", "220.243.128.0/18",
                "220.248.0.0/14", "220.252.0.0/16", "221.0.0.0/13", "221.8.0.0/14",
                "221.12.0.0/17", "221.12.128.0/18", "221.13.0.0/16", "221.14.0.0/15",
                "221.122.0.0/15", "221.128.128.0/17", "221.129.0.0/16", "221.130.0.0/15",
                "221.133.224.0/19", "221.136.0.0/15", "221.172.0.0/14", "221.176.0.0/19",
                "221.176.64.0/18", "221.176.128.0/17", "221.177.0.0/16", "221.178.0.0/15",
                "221.180.0.0/14", "221.192.0.0/14", "221.196.0.0/15", "221.198.0.0/16",
                "221.199.0.0/17", "221.199.128.0/18", "221.199.224.0/19", "221.200.0.0/13",
                "221.208.0.0/12", "221.224.0.0/12", "222.16.0.0/12", "222.32.0.0/11",
                "222.64.0.0/11", "222.125.0.0/16", "222.126.128.0/19", "222.128.0.0/12",
                "222.160.0.0/14", "222.168.0.0/13", "222.176.0.0/12", "222.192.0.0/11",
                "222.240.0.0/13", "222.248.0.0/15", "223.0.0.0/12", "223.20.0.0/15",
                "223.64.0.0/11", "223.96.0.0/12", "223.112.0.0/14", "223.116.0.0/15",
                "223.120.0.0/13", "223.128.0.0/15", "223.144.0.0/12", "223.160.0.0/14",
                "223.166.0.0/15", "223.192.0.0/15", "223.198.0.0/15", "223.201.0.0/18",
                "223.201.160.0/19", "223.201.192.0/19", "223.202.0.0/17", "223.202.128.0/18",
                "223.202.192.0/19", "223.203.0.0/16", "223.208.0.0/13", "223.220.0.0/15",
                "223.240.0.0/13", "223.248.0.0/14", "223.252.128.0/19", "223.252.192.0/18",
                "223.254.0.0/17", "223.254.128.0/18", "223.255.0.0/17"
            }
	};

}
