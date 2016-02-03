package com.github.uryyyyyyy.aerospike;

import com.aerospike.client.AerospikeClient;
import com.aerospike.client.Bin;
import com.aerospike.client.Key;
import com.aerospike.client.Record;

public class ManyLoad {

	public static void main(String[] args){
		AerospikeClient client = new AerospikeClient("172.17.0.3", 3000);

		setValues(client);

		Key key = new Key("test", "demo", "key" + 333);
		Record record = client.get(null, key);
		System.out.println(record.bins.get("bin"));
		client.close();
	}

	private static void setValues(AerospikeClient client) {
		long start2 = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++){
			Key key = new Key("test", "demo", "key" + i);
			Bin bin = new Bin("bin", "value" + i);
			client.put(null, key, bin);
		}
		System.out.println(System.currentTimeMillis() - start2 + " ms");
	}
}
