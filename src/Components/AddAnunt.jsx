import React from 'react'


function AddAnunt() {
    return (
        <section class="page-section" id="contact" style={{ background: "#E2C1FF" }}>
            <div class="container px-4 px-lg-5">
                <div class="row gx-4 gx-lg-5 justify-content-center">
                    <div class="col-lg-8 col-xl-6 text-center">
                        <h2 class="mt-0">Adauga un anunt!</h2>
                        <hr class="divider" />
                        <p class="text-muted mb-5">Ajuta un animalut sa isi gaseasca o noua casa</p>
                    </div>
                </div>
                <div class="row gx-4 gx-lg-5 justify-content-center mb-5">
                    <div class="col-lg-6">

                        <form id="contactForm" data-sb-form-api-token="API_TOKEN">

                            <div class="form-floating mb-3">
                                <input class="form-control" id="name" type="text" placeholder="Enter your name..."
                                    data-sb-validations="required" />
                                <label for="name">Nume Animal</label>
                                <div class="invalid-feedback" data-sb-feedback="name:required">A name is required.</div>
                            </div>

                            <div class="form-floating mb-3">
                                <input class="form-control" id="email" type="email" placeholder="name@example.com"
                                    data-sb-validations="required,email" />
                                <label for="email">Varsta</label>
                                <div class="invalid-feedback" data-sb-feedback="email:required">An email is required.</div>
                                <div class="invalid-feedback" data-sb-feedback="email:email">Email is not valid.</div>
                            </div>

                            <div class="form-floating mb-3">
                                <input class="form-control" id="phone" type="tel" placeholder="(123) 456-7890"
                                    data-sb-validations="required" />
                                <label for="phone">Numar Telefon</label>
                                <div class="invalid-feedback" data-sb-feedback="phone:required">A phone number is required.
                                </div>
                            </div>
                            <div class="form-floating mb-3">
                                <textarea class="form-control" id="message" type="text"
                                    placeholder="Enter your message here..." style={{ height: '5rem' }}
                                    data-sb-validations="required"></textarea>
                                <label for="message">Link Poza</label>
                                <div class="invalid-feedback" data-sb-feedback="message:required">A message is required.
                                </div>
                            </div>

                            <div class="form-floating mb-3">
                                <textarea class="form-control" id="message" type="text"
                                    placeholder="Enter your message here..." style={{ height: '10rem' }}
                                    data-sb-validations="required"></textarea>
                                <label for="message">Mesaj</label>
                                <div class="invalid-feedback" data-sb-feedback="message:required">A message is required.
                                </div>
                            </div>




                            <div class="d-grid"><button class="btn btn-primary btn-xl disabled" id="submitButton"
                                type="submit">Submit</button></div>
                        </form>
                    </div>
                </div>

            </div>

        </section>
    )
}

export default AddAnunt