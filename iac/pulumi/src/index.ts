import * as gcp from '@pulumi/gcp';

import { image, memoryLimit, region } from './lib/configuration';

export = async () => {
  const service = new gcp.cloudrun.Service(
    'cloud-run-service-demo-api',
    {
      location: region,
      template: {
        spec: {
          containers: [
            {
              image: image,
              resources: {
                limits: {
                  memory: memoryLimit,
                  cpu: '1000m',
                },
              },
            },
          ],
          containerConcurrency: 50,
        },
      },
    },
    {},
  );

  new gcp.cloudrun.IamMember('cloud-run-service-demo-api-public-access', {
    service: service.name,
    location: region,
    role: 'roles/run.invoker',
    member: 'allUsers',
  });

  return {
    url: service.statuses[0].url,
  };
};
