#!/bin/sh
##
# $FLINK_HOME is defined by Dockerfile.
# $FLINK_S3_* will be defined when the container start.

if [ -n "$FLINK_S3_ACCESS_KEY" ]; then
  echo "s3.access-key: ${FLINK_S3_ACCESS_KEY}" >> "$FLINK_HOME/conf/flink-conf.yaml"
fi

if [ -n "$FLINK_S3_SECRET_KEY" ]; then
  echo "s3.secret-key: ${FLINK_S3_SECRET_KEY}" >> "$FLINK_HOME/conf/flink-conf.yaml"
fi

if [ -n "$FLINK_TASKMANAGER_MEMORY_SIZE" ]; then
  echo "taskmanager.memory.flink.size: ${FLINK_TASKMANAGER_MEMORY_SIZE}" >> "$FLINK_HOME/conf/flink-conf.yaml"
fi

if [ -n "$FLINK_TASKMANAGER_MEMORY_PROCESS_SIZE" ]; then
  echo "taskmanager.memory.process.size: ${FLINK_TASKMANAGER_MEMORY_PROCESS_SIZE}" >> "$FLINK_HOME/conf/flink-conf.yaml"
fi

if [ -n "$FLINK_JOBMANAGER_MEMORY_SIZE" ]; then
  echo "jobmanager.memory.flink.size: ${FLINK_JOBMANAGER_MEMORY_SIZE}" >> "$FLINK_HOME/conf/flink-conf.yaml"
fi

if [ -n "$FLINK_JOBMANAGER_MEMORY_PROCESS_SIZE" ]; then
  echo "jobmanager.memory.process.size: ${FLINK_JOBMANAGER_MEMORY_PROCESS_SIZE}" >> "$FLINK_HOME/conf/flink-conf.yaml"
fi
# https://ci.apache.org/projects/flink/flink-docs-release-1.4/ops/deployment/aws.html#shaded-hadooppresto-s3-file-systems-recommended
mkdir $FLINK_HOME/plugins/s3-fs-hadoop
cp $FLINK_HOME/opt/flink-s3-fs-hadoop-1.14.5.jar $FLINK_HOME/plugins/s3-fs-hadoop

exec /docker-entrypoint.sh $@