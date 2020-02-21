import { TestBed } from '@angular/core/testing';

import { DemandaService } from './demanda.service';

describe('DemandaService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: DemandaService = TestBed.get(DemandaService);
    expect(service).toBeTruthy();
  });
});
