import { WhatToEatDilemmaSolverPage } from './app.po';

describe('what-to-eat-dilemma-solver App', () => {
  let page: WhatToEatDilemmaSolverPage;

  beforeEach(() => {
    page = new WhatToEatDilemmaSolverPage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!!');
  });
});
