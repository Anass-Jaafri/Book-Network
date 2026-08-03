import { TestBed } from '@angular/core/testing';

import { HttpTokenInterceptorTsInterceptor } from './http-token.interceptor';

describe('HttpTokenInterceptorTsInterceptor', () => {
  beforeEach(() =>
    TestBed.configureTestingModule({
      providers: [HttpTokenInterceptorTsInterceptor],
    }),
  );

  it('should be created', () => {
    const interceptor: HttpTokenInterceptorTsInterceptor = TestBed.inject(
      HttpTokenInterceptorTsInterceptor,
    );
    expect(interceptor).toBeTruthy();
  });
});
