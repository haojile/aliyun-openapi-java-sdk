/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeDisksResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeDisksResponse.Disk;
import com.aliyuncs.ecs.model.v20140526.DescribeDisksResponse.Disk.Category;
import com.aliyuncs.ecs.model.v20140526.DescribeDisksResponse.Disk.OperationLock;
import com.aliyuncs.ecs.model.v20140526.DescribeDisksResponse.Disk.Tag;
import com.aliyuncs.ecs.model.v20140526.DescribeDisksResponse.Disk.Type;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDisksResponseUnmarshaller {

	public static DescribeDisksResponse unmarshall(DescribeDisksResponse describeDisksResponse, UnmarshallerContext context) {
		
		describeDisksResponse.setRequestId(context.stringValue("DescribeDisksResponse.RequestId"));
		describeDisksResponse.setTotalCount(context.integerValue("DescribeDisksResponse.TotalCount"));
		describeDisksResponse.setPageNumber(context.integerValue("DescribeDisksResponse.PageNumber"));
		describeDisksResponse.setPageSize(context.integerValue("DescribeDisksResponse.PageSize"));

		List<Disk> disks = new ArrayList<Disk>();
		for (int i = 0; i < context.lengthValue("DescribeDisksResponse.Disks.Length"); i++) {
			Disk disk = new Disk();
			disk.setDiskId(context.stringValue("DescribeDisksResponse.Disks["+ i +"].DiskId"));
			disk.setRegionId(context.stringValue("DescribeDisksResponse.Disks["+ i +"].RegionId"));
			disk.setZoneId(context.stringValue("DescribeDisksResponse.Disks["+ i +"].ZoneId"));
			disk.setDiskName(context.stringValue("DescribeDisksResponse.Disks["+ i +"].DiskName"));
			disk.setDescription(context.stringValue("DescribeDisksResponse.Disks["+ i +"].Description"));
			disk.setType(Type.getEnum(context.stringValue("DescribeDisksResponse.Disks["+ i +"].Type")));
			disk.setCategory(Category.getEnum(context.stringValue("DescribeDisksResponse.Disks["+ i +"].Category")));
			disk.setSize(context.integerValue("DescribeDisksResponse.Disks["+ i +"].Size"));
			disk.setImageId(context.stringValue("DescribeDisksResponse.Disks["+ i +"].ImageId"));
			disk.setSourceSnapshotId(context.stringValue("DescribeDisksResponse.Disks["+ i +"].SourceSnapshotId"));
			disk.setAutoSnapshotPolicyId(context.stringValue("DescribeDisksResponse.Disks["+ i +"].AutoSnapshotPolicyId"));
			disk.setProductCode(context.stringValue("DescribeDisksResponse.Disks["+ i +"].ProductCode"));
			disk.setPortable(context.booleanValue("DescribeDisksResponse.Disks["+ i +"].Portable"));
			disk.setStatus(context.stringValue("DescribeDisksResponse.Disks["+ i +"].Status"));
			disk.setInstanceId(context.stringValue("DescribeDisksResponse.Disks["+ i +"].InstanceId"));
			disk.setDevice(context.stringValue("DescribeDisksResponse.Disks["+ i +"].Device"));
			disk.setDeleteWithInstance(context.booleanValue("DescribeDisksResponse.Disks["+ i +"].DeleteWithInstance"));
			disk.setDeleteAutoSnapshot(context.booleanValue("DescribeDisksResponse.Disks["+ i +"].DeleteAutoSnapshot"));
			disk.setEnableAutoSnapshot(context.booleanValue("DescribeDisksResponse.Disks["+ i +"].EnableAutoSnapshot"));
			disk.setEnableAutomatedSnapshotPolicy(context.booleanValue("DescribeDisksResponse.Disks["+ i +"].EnableAutomatedSnapshotPolicy"));
			disk.setCreationTime(context.stringValue("DescribeDisksResponse.Disks["+ i +"].CreationTime"));
			disk.setAttachedTime(context.stringValue("DescribeDisksResponse.Disks["+ i +"].AttachedTime"));
			disk.setDetachedTime(context.stringValue("DescribeDisksResponse.Disks["+ i +"].DetachedTime"));
			disk.setDiskChargeType(context.stringValue("DescribeDisksResponse.Disks["+ i +"].DiskChargeType"));
			disk.setExpiredTime(context.stringValue("DescribeDisksResponse.Disks["+ i +"].ExpiredTime"));

			List<OperationLock> operationLocks = new ArrayList<OperationLock>();
			for (int j = 0; j < context.lengthValue("DescribeDisksResponse.Disks["+ i +"].OperationLocks.Length"); j++) {
				OperationLock operationLock = new OperationLock();
				operationLock.setLockReason(context.stringValue("DescribeDisksResponse.Disks["+ i +"].OperationLocks["+ j +"].LockReason"));

				operationLocks.add(operationLock);
			}
			disk.setOperationLocks(operationLocks);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < context.lengthValue("DescribeDisksResponse.Disks["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(context.stringValue("DescribeDisksResponse.Disks["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(context.stringValue("DescribeDisksResponse.Disks["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			disk.setTags(tags);

			disks.add(disk);
		}
		describeDisksResponse.setDisks(disks);
	 
	 	return describeDisksResponse;
	}
}