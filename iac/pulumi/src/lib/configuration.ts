import * as gcp from '@pulumi/gcp';
import { Config, getStack } from '@pulumi/pulumi';

export const environment = getStack();

const config = new Config();
export const image = config.require<string>('image');
export const memoryLimit = config.require<string>('memory');

export const region =
  gcp.config.region || process.env.CLOUDSDK_COMPUTE_REGION || 'europe-west4';

export const commonLabels = {
  environment: environment,
  purpose: 'bswe-3b',
  application: 'demo',
};
